package whileloop;

import java.util.Scanner;
// factor of the number
public class ques24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int num=scanner.nextInt();
        int i=1;
        while(i<=num){
            if(num % i == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
