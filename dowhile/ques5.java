package dowhile;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int rev=0;
        do{
            rev=rev*10+(num % 10);
            num/=10;
        }while(num != 0);
        System.out.println("reverse number: "+rev);
    }
}
