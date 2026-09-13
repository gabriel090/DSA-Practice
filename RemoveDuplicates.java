public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {2,2,3,3,4,6,6};
        System.out.println("Before loop");
        for(int num : nums){
            System.out.print(" "+num);
        }
        removeDuplicates(nums);
        System.out.println();
        System.out.println("After loop");
        for(int num : nums){
            System.out.print(" "+num);
        }
    }

//    private static int removeDuplicate(int[] nums) {
//        int rd = 0;
//        for(int i = 1; i < nums.length; i ++){
//            if(nums[rd] != nums[i]){
//                rd++;
//                nums[rd] = nums[i];
//            }
//        }
//        return rd + 1;
//    }
    public static int removeDuplicates(int[] nums) {

        int temp = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[temp] != nums[i]){
                temp++;
                nums[temp] = nums[i];
            }
        }
        return temp + 1;
    }
}
