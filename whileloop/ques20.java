package whileloop;

import java.util.Scanner;

public class ques20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=scanner.nextInt();
        int sum=0;
        int first_num=0,second_num=1;
        int i=1;
        while(i<=n){
            sum+=first_num;
            int new_num=first_num+second_num;
            second_num=first_num;
            first_num=new_num;
            i++;
        }
        System.out.println("sum of fibonacci series: "+sum);
    }
}
