import java.util.Arrays;

public class LessonSixTwo {

    //public static void main(String[] args) {
//
    //    int arr[] = new int[3];
    //    arr[0] = 4;
    //    arr[1] = 1;
    //    arr[2] = 4;
//
    //    LessonSixTwo lessonSixTwo = new LessonSixTwo();
    //    System.out.println(lessonSixTwo.CheckFourAndOne(arr));
    //}

    public boolean CheckFourAndOne(int[] array) {
        boolean checkFour = false;
        boolean checkOne = false;
        //boolean checkNumber = false;
        System.out.println(Arrays.toString(array));
        for (int j = 0; j < array.length; j++) {
            if (array[j] == 1 | array[j] == 4) {
                //checkNumber = true;
                if (array[j] == 1) {
                    checkOne = true;
                } else if (array[j] == 4) {
                    checkFour = true;
                }
            } else {
                return false;
            }
        }

        if (checkFour == true && checkOne == true) {
            return true;
        } else {
            return false;
        }
    }
}
