package whileloop;

import java.util.Scanner;
// multiplication table of given number
public class ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of num:");
        int num=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num*i);
        }
    }
}
