package Exercise_Two;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_to_ArrayList<T> {

    public Array_to_ArrayList(T [] array) {

        // Метод меняющий массив на ArrayList
        System.out.println("Переданный массив имеет тип: " + array.getClass().getName());
        ArrayList<T> arr = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arr.add(array[i]);
        }
        System.out.println("Тип массива изменен на: " + arr.getClass().getName());
        System.out.println(Arrays.asList(arr));
    }

    public static void main(String[] args) {

        //Для смены типа массива
        String[] array = {"А", "Б", "В"};
        Array_to_ArrayList<String> arrayInt = new Array_to_ArrayList<>(array);
    }
}
