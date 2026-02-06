package whileloop;

import java.util.Scanner;

public class ques23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=scanner.nextInt();
        System.out.println("enter the value of b:");
        int b=scanner.nextInt();
        while(a<=b){
            if(a % 7 == 0){
                System.out.println("this number is divisible by 7 - "+a);
            }
            a++;
        }
    }
}
