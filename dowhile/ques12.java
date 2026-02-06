package dowhile;

import java.util.Scanner;

public class ques12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number first :");
        System.out.println("enter number second:");
        System.out.println("enter opertion:");
        boolean flag=true;
        do{
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            String operation=scanner.next();
            if(a == 0){
                flag=false;
            }
            if(operation.equals("+")){
                System.out.println("additon:"+(a+b));
            }
            else if(operation.equals("-")){
                System.out.println("subtraction: "+(a-b));
            }
            else if(operation.equals("*")){
                System.out.println("mulitplication:"+(a*b));
            }
            else if(operation.equals("/")){
                System.out.println("division: "+(a/b));
            }
        }while(flag);
    }
}
