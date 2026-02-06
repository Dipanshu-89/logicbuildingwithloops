package forloop;

import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                sum+=i;
            }
        }
        System.out.println("sum of all factors is: "+sum);
    }
}
