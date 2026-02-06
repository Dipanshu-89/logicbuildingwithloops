package dowhile;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int a=scanner.nextInt();
        int i=1;
        do{
            System.out.println(a+" X "+i+" = "+a*i);
            i++;
        }while(i<=10);
    }
}
