package phase4;

public class ques7 {
    public static void main(String[] args) {
        int sum=0;
        int i= 1;
        while(i != 0){
            sum+= i;
            if(sum>=100){
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
