package whileloop;

import java.util.Scanner;
// palindrome number
public class ques13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=scanner.nextInt();
        int temp=n;
        int sum=0;
        while(n != 0){
            sum=sum*10+(n%10);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("palindrome number");
        }else{
            System.out.println("not palindrome number");
        }
    }
}
