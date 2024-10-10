package neetcode;

/*
This question is from an online test for Turing.
If I passed I wouldn't be here:

The task is as following:

Check the occurrence of an alphabet that occurs twice in the first counting
of the array:

Array: cabbcd
Output: b

Array: poptgh
Output: p
 */

public class teamOut {

    public static char team(String s){
        StringBuilder str = new StringBuilder(s);

        for(int i =0; i < s.length(); i++){
            for(int j=i+1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    return s.charAt(i);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args){
        String s = "acdppek";
        String s1 = "poee";
        System.out.println("the winner is:=---->" + team(s));
        System.out.println("the winner is:=---->" + team(s1));
    }
}
