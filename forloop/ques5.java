package forloop;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value:");
        int num=scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
