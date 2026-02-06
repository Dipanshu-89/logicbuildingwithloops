package whileloop;

import java.util.Scanner;
// perfect number
public class ques16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of num:");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while (i<n){
            if (n % i == 0){
                sum=sum+i;
            }
            i++;
        }
        if(sum==n){
            System.out.println("perfect number");
        }else{
            System.out.println("non-perfect number");
        }
    }
}
