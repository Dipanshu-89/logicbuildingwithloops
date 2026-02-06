package dowhile;

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int temp=n;
        int sum=0;
        int count=0;
        do{
            count++;
            n=n/10;
        }while(n != 0);
        n=temp;
        do{
            sum=sum+(int) Math.pow(n%10,count);
            n=n/10;
        }while(n != 0);
        if(temp == sum){
            System.out.println("armstrong number");
        }else{
            System.out.println("not armstrong number");
        }
    }
}
