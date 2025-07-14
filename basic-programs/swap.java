import java.util.Scanner;
class swap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("swapped first number: "+a);
        System.out.println("swapped second number: "+b);
    }
}