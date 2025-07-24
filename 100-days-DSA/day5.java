//Day 5: Arrays – Selection Sort in Java
class day5{
    public static void selectionsort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int minindex=i;

            for(int j=i+1;j<n;j++){ //to find minimum element
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            } 
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args){
        int[] arr={64,24,86,29,45,93,12};

        System.out.println("array before sorting : ");
        for(int num:arr){
            System.out.print(num+" ");
        }

        selectionsort(arr);

        System.out.println("\narray after sorting : ");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}