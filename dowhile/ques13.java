package dowhile;

import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c=-1;
        boolean flag=true;
        do{
            int n=scanner.nextInt();
            if(n<0){
                flag=false;
            }
            c++;
        }while(flag);
        System.out.println("positive number occurs :"+c+" times");
    }
}
