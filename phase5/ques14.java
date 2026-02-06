package phase5;

import java.util.Scanner;

public class ques14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the term you want:");
        int n=sc.nextInt();
        System.out.println("enter the value of x:");
        int x=sc.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++){
            int fact=1;
            for(int j=1;j<=i;j++){
                fact*=j;
            }
            if(i % 2 == 0){
                sum-=(float) Math.pow(x,i)/fact;
            }else{
                sum+=(float) Math.pow(x,i)/fact;
            }
        }
        System.out.println(sum);
    }
}
