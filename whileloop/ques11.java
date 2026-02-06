package whileloop;

import java.util.Scanner;
// count digit of number
public class ques11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scanner.nextInt();
        int count=0;
        while(n != 0){
            count++;
            n=n/10;
        }
        System.out.println("total number of digits: "+count);
    }
}
