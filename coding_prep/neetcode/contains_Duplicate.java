package neetcode;

public class contains_Duplicate {

    public static boolean duplicate(int[] nums){
        if(nums.length == 0){
            return false;
        }
        for(int i=0; i < nums.length; i++){
            for(int j=i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{};
        int[] arr3 = new int[]{1,2,3,1,2,3};
       // int arr2 = [1,2,3,3];
        System.out.println(duplicate(arr1));
        System.out.println(duplicate(arr2));
        System.out.println(duplicate(arr3));

    }


}
