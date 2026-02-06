package whileloop;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        boolean flag=true;
        while (flag){
            System.out.println("enter the number (if you want to exit then press or give input 0)");
            int input=scanner.nextInt();
            if (input == 0){
                flag=false;
            }
            sum+=input;
        }
        System.out.printf("%d",sum);
    }
}
