package whileloop;

import java.util.Scanner;
// factorial number
public class ques9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("factorial of number is: "+fact);
    }
}
