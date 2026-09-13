public class Test {
    public static void main(String[] args) {
       int[] arr = {1,8,15,2,5};
       int k = 13;
        for (int i =0;i<arr.length;i++){
            for (int j=1 ;j<arr.length;j++){
              if(arr[i]+arr[j]==k){
                  System.out.print( "("+ arr[i] +" ," + arr[j]+")");
                  break;
              } }
        }


    }
}
