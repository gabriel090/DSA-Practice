public class ReverseArray {
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void reverseArr(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,8,4,6,8,9,1};
        printArray(arr);
        int start = 0;
        int end = arr.length-1;
         reverseArr(arr,start,end);
        printArray(arr);

    }
}
