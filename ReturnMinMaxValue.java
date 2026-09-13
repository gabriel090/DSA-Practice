public class ReturnMinMaxValue {

    public int returnMin(int[] arr){
        //edge
        if(arr ==null || arr.length ==0){
           throw new IllegalArgumentException("Invalid input");
        }
        int min = arr[0];
        for(int i =1; i < arr.length;i++){
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
      int[] arr = {5,1,3,7,2,7};
      ReturnMinMaxValue rt = new ReturnMinMaxValue();
        System.out.println( rt.returnMin(arr));
    }
}
