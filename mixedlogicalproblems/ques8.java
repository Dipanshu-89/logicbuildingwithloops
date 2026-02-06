package mixedlogicalproblems;

public class ques8 {
    public static void main(String[] args) {
        for(int i=1;i<=153;i++){
            int temp=i;
            int c=0;
            while(temp != 0){
                c++;
                temp=temp/10;
            }
            temp=i;
            int sum=0;
            while(temp != 0){
                int r=temp % 10;
                sum=sum+(int)Math.pow(r,c);
                temp=temp/10;
            }
            if(i==sum){
                System.out.println("this number "+i+" "+"armsstrong number");
            }
        }
    }
}
