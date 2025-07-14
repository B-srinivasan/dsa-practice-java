import java.util.Scanner;
class armstrong{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=num,sum=0,digits=0;

        int countnum=num;
        while(countnum!=0){
            countnum /=10;
            digits++;
        }

        while(temp!=0){
            int digit=temp%10;
            sum += Math.pow(digit,digits);
            temp/=10;
        }

        if(num==sum){
            System.out.println(num+" is armstrong");
        }
        else{
            System.out.println(num+ " is not armstrong");
        }
    }
}