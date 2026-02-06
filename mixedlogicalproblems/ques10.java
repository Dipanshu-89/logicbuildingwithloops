package mixedlogicalproblems;

import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int maxSum = 0;
        int digit=0;
        for(int i=1;i<=n;i++){
            int sum=0;
            int temp=i;
            while(temp != 0){
                sum+= temp%10;
                temp/=10;
            }
            if(sum>maxSum){
                maxSum=sum;
                digit=i;
            }
        }
        System.out.println("max sum is "+ maxSum+" and value is "+digit);
    }
}
