import java.util.Scanner;
class prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int num=sc.nextInt();
        boolean isprime=true;

        if(num<=1) isprime=false;

        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isprime=false;
                break;
            }
        }

        if(isprime){
            System.out.println(num+" is a prime");
        }
        else{
            System.out.println(num+" is not a prime");
        }
    }
}