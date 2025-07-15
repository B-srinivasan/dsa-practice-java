import java.util.Scanner;
class revnum{
    public int reverse(int num){
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev = rev*10+digit;
            num /=10;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        int num=sc.nextInt();
        revnum obj=new revnum();
        System.out.println(obj.reverse(num));
    }
}