package neetcode;

public class two_sum {
    public static int[] twoSum(int[] nums, int target){
        for(int i=0; i < nums.length; i++){
            for(int j= i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    //System.out.println(i+j);
                    return new int[] {i,j};
                }
            }
        }
        //System.out.println("no solution");
        return new int[] {};
    }

    public static void main(String[] args){
        int[] nums = {4,88,6};
        int target = 10;
        int[] result = twoSum(nums,target);

        if(result.length == 0){
            System.out.println("no silution");
        } else {
            System.out.println("Indices " + result[0] + "and " + result[1]);
        }
    }
}
