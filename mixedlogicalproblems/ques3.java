package mixedlogicalproblems;

public class ques3 {
    public static void main(String[] args) {
        for(int i=1;i<=500;i++){
            int rev=0;
            int temp=i;
            int n=i;
            while(n != 0){
                int r=n % 10;
                rev=rev*10+r;
                n=n/10;
            }
            if(temp == rev){
                System.out.println(i);
            }
        }
    }
}
