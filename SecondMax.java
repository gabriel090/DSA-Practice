public class SecondMax {
    public int returnSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if( arr[i] >max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax =arr[i];
            }
        }


        return secondMax;
    }

    public static void main(String[] args) {
        int[]  arr = {23,1,2,56,43,23,56};

        SecondMax secondMax = new SecondMax();
        System.out.println(secondMax.returnSecondMax(arr));
    }
}
