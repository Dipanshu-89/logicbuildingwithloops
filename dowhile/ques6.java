package dowhile;

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=scanner.nextInt();
        int temp=n;
        int rev=0;
        do{
             rev=rev*10+(n % 10);
             n=n/10;
        }while(n != 0);
        if(rev==temp){
            System.out.println("palindrome number");
        }else{
            System.out.println("not palindrome number");
        }
    }
}
