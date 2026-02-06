package whileloop;

import java.util.Scanner;
// product of digit that particular number
public class ques10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int pro=1;
        while (n>0)
        {
            pro*=n%10;
            n/=10;
        }
        System.out.println(pro);
    }
}
