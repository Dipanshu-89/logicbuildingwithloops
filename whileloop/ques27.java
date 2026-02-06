package whileloop;

import java.util.Scanner;

public class ques27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=scanner.nextInt();
        System.out.println("enter the value of b:");
        int b=scanner.nextInt();
        int temp1=a;
        int temp2=b;
        while(a != 0){
            int hcf=a;
            a=b % a;
            b=hcf;
        }
        int lcm=(temp1*temp2)/b;
        System.out.println("lcm of a and b : "+lcm);
    }
}
