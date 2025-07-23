//Day 4 Topic: Arrays – Sorting (Bubble Sort)
import java.util.Scanner;
import java.util.Arrays;
class day4{
    public static void bubblesort(int[] arr){
        int n=arr.length;
        boolean swapped;

        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of elements : ");
        int num=sc.nextInt();

        int[] arr=new int[num];
        System.out.println("enter array elemrents : ");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }

        bubblesort(arr);

        System.out.println("sorted array : "+Arrays.toString(arr));
    }
}