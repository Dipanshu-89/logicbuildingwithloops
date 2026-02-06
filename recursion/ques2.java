package recursion;

public class ques2 {
    public void display(int n){
        if(n<1){
            return;
        }else{
            System.out.print(n);
            display(n-1);
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        ques2 obj=new ques2();
        obj.display(3);
    }
}
