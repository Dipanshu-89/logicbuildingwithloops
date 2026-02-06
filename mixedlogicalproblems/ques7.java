package mixedlogicalproblems;

public class ques7 {
    public static void main(String[] args) {
        int num=1141;
        int evensum=0;
        int oddSum=0;
        while(num != 0){
            int r=num % 10;
            if(r % 2 == 0){
                evensum+=r;
            }else{
                oddSum+=r;
            }
            num=num/10;
        }
        System.out.println("even digit sum is:"+evensum);
        System.out.println("odd digit sum is: "+oddSum);
    }
}
