package forloop;

import java.util.Scanner;

public class ques14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first num:");
        int a=scanner.nextInt();
        System.out.println("enter the second num:");
        int b=scanner.nextInt();
        while(b != 0){
            int hcf=b;
            b=a % b;
            a=hcf;
        }
        System.out.println("hcf is:"+a);

    }
}
