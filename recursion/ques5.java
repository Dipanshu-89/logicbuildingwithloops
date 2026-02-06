package recursion;

public class ques5 {
    public static void reverse(String s, int l){
        if(l<0){
            return;
        }else{
            System.out.print(s.charAt(l--));
            reverse(s,l);
        }
    }
    public static void main(String[] args){
        String input="dipanshu";
        int l1=input.length()-1;
        ques5.reverse(input,l1);
    }
}

