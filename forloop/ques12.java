package forloop;

import java.util.Scanner;

public class ques12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of N:");
        int n=sc.nextInt();
        System.out.print("factors of "+n+" number is"+" ");
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
