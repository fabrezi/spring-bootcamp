public class Duplicate_Integer {

    //Given an integer array nums,
    // return true if any value appears more than once in the array, otherwise return false.

    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args){
        //int[] nums =  [1,2,3];
    }
}
