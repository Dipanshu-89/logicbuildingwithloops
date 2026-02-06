package whileloop;

import java.util.Scanner;
// reverse number
public class ques12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int reverse=0;
        while(n != 0){
            reverse=reverse*10+(n % 10);
            n=n/10;
        }
        System.out.println("reverse number: "+reverse);
    }
}
