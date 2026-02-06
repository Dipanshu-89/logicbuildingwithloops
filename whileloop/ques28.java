package whileloop;

import java.util.Scanner;

public class ques28 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scanner.nextInt();
        int larger=0;
        while(num != 0){
            int r=num%10;
            if(larger<r){
                larger=r;
            }
            num/=10;
        }
        System.out.println("largest digit in a number: "+larger);
    }
}
