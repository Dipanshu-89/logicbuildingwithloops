package whileloop;

import java.util.Scanner;
// fibonacci series
public class ques19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        int first_num=0;
        int second_num=1;
        while(i<=n){
            System.out.println(first_num);
            int new_num=first_num+second_num;
            second_num=first_num;
            first_num=new_num;
            i++;
        }
    }
}
