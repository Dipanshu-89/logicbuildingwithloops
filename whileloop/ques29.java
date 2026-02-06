package whileloop;

import java.util.Scanner;

public class ques29 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scanner.nextInt();
        int min=9;
        while(n != 0){
            int r=n % 10;
            if(r<min){
                min=r;
            }
            n=n/10;
        }
        System.out.println(min);
    }
}
