package Exercise_Two;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList  {

    private <T> ArrayList <T> changeToArray(T [] array) {
        System.out.println("Переданный массив имеет тип: " + array.getClass().getName());
        ArrayList<T> arr = new ArrayList<T>();
            for (int i = 0; i < array.length; i++) {
                arr.add(array[i]);
            }
        System.out.println("Тип массива изменен на: " + arr.getClass().getName());
        System.out.println(Arrays.asList(arr));
        return arr;
    }

    public static void main(String[] args) {
        //Для смены типа массива
        String[] array = {"А", "Б", "В"};

        final ArrayToArrayList change = new ArrayToArrayList();
        change.changeToArray(array);
    }
}
