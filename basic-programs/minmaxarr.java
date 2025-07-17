class minmaxarr{
    public static void main(String[] args){
        int[] arr={31,95,56,87,24};
        int min=arr[0];
        int max=arr[0];
        for(int num:arr){
            if(min<num){
                min=num;
            }
            if(max>num){
                max=num;
            }
        }
        System.out.println("minimum : "+min);
        System.out.print("maximum : "+max);
    }
}