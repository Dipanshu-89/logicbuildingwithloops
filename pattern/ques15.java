package pattern;

public class ques15 {
    public static void main(String[] args) {
        int n=5;
        int sum=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(sum % 2 == 0){
                    System.out.print(0);
                }else{
                    System.out.print(1);
                }
                sum+=1;
            }
            System.out.println();
        }
    }
}
