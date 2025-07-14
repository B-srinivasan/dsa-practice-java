import java.util.Scanner;
class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word to check:");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str+" is palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
    }
}