package forloop;

import java.util.Scanner;

public class ques11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the term:");
        int n=sc.nextInt();
        int first_num=0;
        int second_num=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=first_num;
            int new_term=first_num+second_num;
            second_num=first_num;
            first_num=new_term;
        }
        System.out.println("sum of fibonacci series: "+sum);
    }
}
