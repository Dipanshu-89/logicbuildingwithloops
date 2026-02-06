package dowhile;

import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value:");
        int n=scanner.nextInt();
        int f_n=0;
        int s_n=1;
        int i=1;
        do{
            System.out.println(f_n);
            int new_n=f_n+s_n;
            s_n=f_n;
            f_n=new_n;
            i++;
        }while(i<=n);
    }
}
