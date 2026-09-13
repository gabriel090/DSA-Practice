public class LinearBinarySearch {
    public static void main(String[] args) {
        int nums[] = { 5, 6, 7, 8, 9, 10};
        int target = 7;
        int results = linearSearch(nums, target);
        int results1 = binarySearch(nums, target);
        if(results != -1){
            System.out.println("The value is found at index: " + results);
        } else {
            System.out.println("The value is not found");
        }

    }
    public String largestNumber(int[] nums) {

        return "";
    }

    private static int linearSearch(int[] nums, int target) {
        for(int i =0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] nums, int target) {
       int left = 0;
       int right = nums.length - 1;

       while(left <= right){
           int mid = (left + right)/2;
           if(nums[mid] == target){
               return mid;
           }else if(nums[mid] < left){
               left = mid + 1;
           }else{
               right = mid-1;
           }

       }


        return -1;
    }

    private static int recursiveSearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;




        return -1;
    }

}
