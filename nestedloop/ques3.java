package nestedloop;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if (i % j == 0){
                    c++;
                }
            }
            System.out.println("this number "+i+" total factors is "+c);
        }
    }
}
