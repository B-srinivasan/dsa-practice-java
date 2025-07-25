//Day 6: Arrays – Insertion Sort in Java
class day6{
    public static void insertionsort(int[] arr){
        int n=arr.length;

        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=key;
        }
    }
    public static void main(String[] args){
        int[] arr={90,45,85,35,72,15};

        System.out.println("array before sorting : ");
        for(int num:arr){
            System.out.print(num+" ");
        }

        insertionsort(arr);

        System.out.println("\narray after sorting : ");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}