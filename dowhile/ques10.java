package dowhile;

import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=scanner.nextInt();
        System.out.println("enter the value of b: ");
        int b=scanner.nextInt();
        do{
            int hcf=b;
            b=a % b;
            a=hcf;
        }while(b != 0);
        System.out.println("hcf: "+a);
    }
}
