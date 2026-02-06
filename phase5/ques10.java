package phase5;

import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        float sum=0.0f;
        for(int i=1;i<=n;i++){
            sum+=(1/(float)i);
        }
        System.out.println(sum);
    }
}
