public class MoveZerosToTheEnd {
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void moveZero(int[] arr, int n){
        int j = 0;
        for(int i = 0; i< arr.length; i ++){
            if(arr[i] !=0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {2,5,1,0,6,0,7,9,3};
        int n = 0;
        moveZero(arr, n);
        printArray(arr);
    }
}
