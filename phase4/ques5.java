package phase4;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("give input: ");
            int n=scanner.nextInt();
            if(n < 0){
                System.out.println("exit from loop using break condition");
                break;
            }else{
                System.out.println(n);
            }
        }
    }
}
