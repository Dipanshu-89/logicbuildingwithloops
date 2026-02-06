package dowhile;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int c=0;
        do{
            c++;
            n/=10;
        }while(n != 0);
        System.out.println("count: "+c);
    }
}
