import java.util.Arrays;

public class LessonSix {

    public int[] arrayOfFours (int [] array) {
        int[] arrayTest = new int[0];
        if (array.length > 1) {
            int lastElement = array.length - 1;
            int countFour = 0;
            try {
                for (int arr : array) {
                    if (arr == 4) {
                        countFour++;
                    }
                }
                int sizeArrayTest = 0;
                for (int i = lastElement; i >= 0; i--) {
                    if (array[i] != 4) {
                        sizeArrayTest++;
                    } else {
                        break;
                    }
                }
                int count = sizeArrayTest - 1;
                arrayTest = new int[sizeArrayTest];
                for (int i = lastElement; i >= 0; i--) {
                    if (array[i] != 4) {
                        arrayTest[count] = array[i];
                        count--;
                    } else {
                        break;
                    }
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Массив пуст!");
        }
        return arrayTest;
    }
}
