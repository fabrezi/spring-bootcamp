import java.lang.reflect.Array;

public class arrays {
    /*
    A while back, I read a blog. It asked about the difference between String.length() and
    Arrays.length().

    Ref: https://www.coderanch.com/t/383558/java/String-length-Arrays-length

    You need to make string and array diagnostics.
     */

    //make an arra
    public static void main(String[] args){
        int[] arr = new int[10];
        String str = "Isquione1@%$";
        int sizer = str.length();
        int size = arr.length;

        System.out.println("size= " + size);
        System.out.println("string-size= " + sizer);
    }


}
