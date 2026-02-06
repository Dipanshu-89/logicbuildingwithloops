package pattern;

public class ques14 {
    public static void main(String[] args) {
        int n=7;
        int sum=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(sum % 10+" ");
                sum+=1;
            }
            System.out.println();
        }
    }
}
