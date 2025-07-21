//Day 2 Topic: Arrays – Binary Search
import java.util.Scanner;
import java.util.Arrays;

public class day2{
    public static int binarysearch(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("enter elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr); // Binary search needs sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        System.out.println("enter a element to search : ");
        int target=sc.nextInt();

        int res=binarysearch(arr,target);

        if(res!=-1){
            System.out.println("element found at index : "+res);
        }
        else{
            System.out.println("element not found");
        }
    }
}