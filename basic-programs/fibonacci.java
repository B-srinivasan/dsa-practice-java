import java.util.Scanner;
class fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int a=0,b=1;
        if(num<=0){
            System.out.println("enter a valid positive number");
        }
        else if(num==1){
            System.out.println("factorial is: "+a);
        }
        else{
            System.out.print(a+" "+b);
            for(int i=2;i<num;i++){
                int c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
            }
        }
    }
}