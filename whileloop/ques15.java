package whileloop;

import java.util.Scanner;
// armstrong number
public class ques15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int temp=num;
        int count=0;
        int sum=0;
        while(num != 0){
            count++;
            num/=10;
        }
        num=temp;
        while(num != 0){
            sum=sum+(int)Math.pow((double)num%10,(double)count);
            num=num/10;
        }
        if(temp == sum){
            System.out.println("armstrong number");
        }else{
            System.out.println("not armstrong number");
        }
    }
}
