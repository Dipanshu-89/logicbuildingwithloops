package phase5;

import java.util.Scanner;

public class ques15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value:");
        int n=scanner.nextInt();
        int sum=0;
        int temp=n;
        for(n=temp;n != 0;n=n/10){
            int r=n % 10;
            int fact=1;
            for(int j=1;j<=r;j++){
                fact*=j;
            }
            sum+=fact;
        }
        if(sum == temp){
            System.out.println("strong number");
        }else{
            System.out.println("not strong number");
        }
    }
}
