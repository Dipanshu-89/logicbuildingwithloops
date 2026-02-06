package mixedlogicalproblems;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            String num=" ";
            int temp=i;
            while(temp !=0){
                int r=temp % 2;
                num=r+num;
                temp=temp/2;
            }
            int c=0;
            for(int i1 = 0;i1<num.length();i1++){
                char s=num.charAt(i1);
//                System.out.println(s);
                if(s=='1'){
                    c++;
                }
            }
            if(c % 2 == 0){
                System.out.println("your output is: "+i);
            }
        }
    }
}
