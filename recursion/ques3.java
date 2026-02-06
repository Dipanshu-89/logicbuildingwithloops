package recursion;

public class ques3 {
    public int sum(int n){
        if(n<1){
            return 0;
        }else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        ques3 obj=new ques3();
        int r=obj.sum(5);
        System.out.println("sum is: "+r);
    }
}
