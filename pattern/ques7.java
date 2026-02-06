package pattern;

public class ques7 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
//            System.out.println("*".repeat(2*i));
            for(int j=1;j<=2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
