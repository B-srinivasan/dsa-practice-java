//Day 3 Topic: Two Pointer Technique – Pair Sum Problem

import java.util.Scanner;
import java.util.Arrays;
class day3{
    public static boolean findpair(int[] arr,int target){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int sum=arr[left]+arr[right];

            if(sum==target){
                System.out.println("pair found at "+arr[left]+ " and "+arr[right]);
                return true;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("no pair found");
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of elements : ");
        int num=sc.nextInt();

        int[] arr=new int[num];
        System.out.println("Enter elements : ");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("sorted array : "+Arrays.toString(arr));

        System.out.println("enter the target sum : ");
        int target=sc.nextInt();

        findpair(arr,target);
    }
}