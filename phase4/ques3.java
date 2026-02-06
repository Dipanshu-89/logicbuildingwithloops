package phase4;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of inputs:");
        int n=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            int r=scanner.nextInt();
            if(r == 0){
                continue;
            }
            sum+=r;
        }
        System.out.println("sum is : "+sum);

    }
}
