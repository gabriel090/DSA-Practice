public class RemoveEvenIntegers {
    public static void printArray(int[] arr){
        int n = arr.length;

        for(int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] removeEven(int[] arr){
        int n = arr.length;
        int oddCount = 0;

        for(int i =0; i<n; i++){
            if(arr[i] % 2 != 0){
                oddCount++;
            }
        }
        int idx = 0;
        int[] result = new int[oddCount];
        for(int i = 0; i< n; i++){
            if(arr[i] % 2 != 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,7,10,6,5};
       int[] result = removeEven(arr);
       printArray(result);

    }


}
