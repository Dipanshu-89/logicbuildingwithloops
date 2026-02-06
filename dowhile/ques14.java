package dowhile;

import java.util.Scanner;

public class ques14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value :");
        int s=scanner.nextInt();
        int evensum=0;
        int oddsum=0;
        do{
            int r=s % 10;
            if(r % 2 == 0){
                evensum+=r;
            }else{
                oddsum+=r;
            }
            s/=10;
        }while(s != 0);
        System.out.println("evensum: "+evensum);
        System.out.println("oddsum: "+oddsum);
    }
}
