
public class InsertionSoart {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 76, 12, 46, 386 };
        insertSorting(arr);
        for (int i : arr){
        System.out.print(i + " ");
        }
    }
    
    public static void insertSorting(int[] arr){
        for(int i = 1; i< arr.length; i++){
          int key = arr[i];
          int j = i-1;
          while(j >= 0 && arr[j] > key){
            arr[j+1] = arr[j];
            j--;
          }
          arr[j+1] = key;
        }
    }

}
