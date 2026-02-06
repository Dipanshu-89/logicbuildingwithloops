package pattern;

public class ques22 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n*2;i++){
            int val=(i>n)?2*n-i:i;
            for(int j=1;j<=val;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
