package p2;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Created by mmendez9 on 2/23/2016.
 */
public class Main2 {
    public static void main(String[] args) {
        // Declare and initialize and integer array
        Integer[] integerArray = {2, 6, 3, 0, 1};

        // Convert the array to an array list
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(integerArray));

        // Convert the array list to an array
        Integer[] intArray2 = new Integer[list.size()];
        list.toArray(intArray2);

        // Print each element of the array
        for (Integer each : intArray2)
            System.out.println(each);

        // Print the array list
        System.out.println(list);
    }
}
