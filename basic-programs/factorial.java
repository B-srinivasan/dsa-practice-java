import java.util.Scanner;
class factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();
        int fact=1;
        if(num<=0){
            System.out.println("enter a valid positive number");
        }
        else{
             for(int i=1;i<=num;i++){
                 fact *= i;
             }
             System.out.println(fact);
        }
    }
}