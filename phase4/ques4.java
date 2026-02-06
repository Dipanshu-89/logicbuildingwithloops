package phase4;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("what number do you want to find: ");
        int f=scanner.nextInt();
        for(int i=1;i<=n;i++){
            int r=scanner.nextInt();
            if(r==f){
                System.out.println("found "+r);
                break;
            }else{
                System.out.println("not found "+r);
            }
        }
    }
}
