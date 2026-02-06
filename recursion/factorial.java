package recursion;

public class factorial {
    public static int factNumber(int v){
        if(v==1 || v==0){
            return 1;
        }else{
            return v*factNumber(v-1);
        }
    }
    public static void main(String[] args){
        int result=factNumber(5);
        System.out.println(result);
    }
}
