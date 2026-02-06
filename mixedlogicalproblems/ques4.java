package mixedlogicalproblems;

public class ques4 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            int sum=0;
            int temp=i;
            while(temp != 0) {
                sum = sum + (temp % 10);
                temp = temp / 10;
            }
            if(sum % 3 == 0){
                System.out.println("this sum is multiple of 3 "+sum+" value of i is "+i);
            }
        }
    }
}
