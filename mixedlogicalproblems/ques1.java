package mixedlogicalproblems;

public class ques1 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            int sum=0;
            int j=i;
            while(j != 0){
                int r=j % 10;
                sum=sum+r;
                j/=10;
            }
            if(sum  % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
