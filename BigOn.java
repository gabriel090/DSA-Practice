import java.util.*;
import java.util.List;
public class BigOn {
    int [] array = {5,6,3,7,9,1,2,8,4};
    int index = linearSearch(array, 8);
//    if(index != -1){
//        System.out.println("The value is "+index);
//    }
//    else{
//        System.out.println("The value is not found");
//    }


    private int linearSearch(int[] array, int value) {
        for(int i =0; i< array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
