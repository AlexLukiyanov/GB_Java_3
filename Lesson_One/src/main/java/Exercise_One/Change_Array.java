package Exercise_One;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Change_Array<T, E extends Integer> {

    public Change_Array(List<T> array, E numberOne, E numberTwo) {
        T number_array = array.get(numberOne);
        array.set(numberOne, array.get(numberTwo));
        array.set(numberTwo, number_array);
        System.out.println("Итоговый массив: " + Arrays.asList(array));
    }


    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("А");
        array.add("Б");
        array.add("В");
        array.add("Г");
        array.add("Д");
        System.out.println("Исходный массив: " + Arrays.asList(array));
        Change_Array swap = new Change_Array(array, 2, 3);
        //
    }
}
