package forloop;

import java.util.Scanner;

public class ques15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a=scanner.nextInt();
        System.out.println("enter the second number:");
        int b=scanner.nextInt();
        int temp1=a;
        int temp2=b;
        while(b != 0){
            int hcf=b;
            b=a % b;
            a=hcf;
        }
        int q=a;
        a=temp1;
        b=temp2;
        int lcm=a*b/q;
        System.out.println("lcm is: "+lcm);
    }
}
