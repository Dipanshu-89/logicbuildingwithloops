package mixedlogicalproblems;

public class ques2 {
    public static void main(String[] args) {
        for(int i=1;i<=500;i++){
            if(i % 7 == 0 && i % 5 != 0){
                System.out.println(i);
            }
        }
    }
}
