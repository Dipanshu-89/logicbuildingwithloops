package nestedloop;
import java.util.Scanner;
public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the row no.: ");
        int n=scanner.nextInt();
        int first_term=0;
        int second_term=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(first_term+" ");
                int new_term=first_term+second_term;
                second_term=first_term;
                first_term=new_term;
            }
            System.out.println();
        }
    }
}
