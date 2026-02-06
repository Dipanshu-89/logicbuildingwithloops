package recursion;

public class ques1 {
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }else{
            return factorial(n-1)*n;
        }
    }

    public static void main(String[] args) {
        int r=ques1.factorial(5);
        System.out.println("your factorial is:"+r);
    }
}
