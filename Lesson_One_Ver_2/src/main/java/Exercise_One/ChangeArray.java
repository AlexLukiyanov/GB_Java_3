package Exercise_One;

import java.util.Arrays;

public class ChangeArray {

    private <T> T [] changeArray (T [] array, int numberOne, int numberTwo) {
        T number = array[numberOne];
        array[numberOne] = array[numberTwo];
        array[numberTwo] = number;
        System.out.println("Итоговый массив: " + Arrays.asList(array));
        return array;
    }


    public static void main(String[] args) {
        String [] arr = {"A", "B", "C", "D"};
        System.out.println("Исходный массив: " + Arrays.asList(arr));
        final ChangeArray changeArray = new ChangeArray();
        changeArray.changeArray(arr, 2, 3);
    }
}
