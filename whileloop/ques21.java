package whileloop;

import java.util.Scanner;
// square of each number from 1 to n
public class ques21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println((int) Math.pow(i,2));
        }
    }
}
