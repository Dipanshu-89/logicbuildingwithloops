package dowhile;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value (otherwise 0)");
        int sum=0;
        boolean flag=true;
        do{
            int n=scanner.nextInt();
            if(n == 0){
                flag=false;
            }
            sum+=n;
        }while(flag);
        System.out.println(sum);
    }
}
