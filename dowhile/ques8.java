package dowhile;

import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=scanner.nextInt();
        int prod=1;
        int i=1;
        do{
            prod*=i;
            i++;
        }while(i<=n);
        System.out.println("factorial: "+ prod);
    }
}
