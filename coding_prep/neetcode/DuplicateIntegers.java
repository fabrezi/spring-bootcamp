package neetcode;

public class DuplicateIntegers {

   public static boolean checker(int[] arr){
       for(int i =0; i < arr.length; i++){
           for(int j = 0; j < arr.length; j++){
               if(arr[i] == arr[j]){
                   return true;
               }
           }
       }
       return false;
   }

   public static void main(String[] args){
       int[] arr = {1,2,3,3};
       System.out.println(checker(arr));
   }
}
