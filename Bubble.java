public class Bubble {
    public static void main(String[] args) {
        int nums[] = {5, 2, 9, 1,386, 7, 76, 12, 46};

        System.out.println("Before sorting");
        bubleSearch(nums);
        for (int num : nums){
            System.out.print("," + num);
        }
        System.out.println();
        System.out.println("--------------");



    }
    public static int bubleSearch(int[] nums ){
        int size = nums.length;
        int temp =0;
        int steps = 0;
        for(int i = 0; i< size; i++){
            for (int j = 0;j<size-i-1;j++){

                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println();
            System.out.println(steps+ " Iteration");
            for (int num : nums){
                System.out.print("," + num);
            }
        }
return -1;
    }

}
