package whileloop;

import java.util.Scanner;
// cube
public class ques22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value:");
        int n=scanner.nextInt();
        int i=1;
        while(i<=n){
            System.out.println((int)Math.pow(i,3));
            i++;
        }
    }
}
