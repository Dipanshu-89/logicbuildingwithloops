package dowhile;

import java.util.Scanner;

public class ques11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag=true;
        int largest=0;
        do{
            int n=scanner.nextInt();
            if(n==0){
                flag=false;
            }
            if(n>largest){
                largest=n;
            }
        }while(flag);
        System.out.println("largest number: "+largest);
    }
}
