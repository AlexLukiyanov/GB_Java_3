import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class ArrayTest {

    private LessonSix lessonSix;

    @Test
    public void testOne() {
        lessonSix = new LessonSix();
        int arrayIntroductory [] = new int[6];
            arrayIntroductory [0] = 3;
            arrayIntroductory [1] = 4;
            arrayIntroductory [2] = 6;
            arrayIntroductory [3] = 4;
            arrayIntroductory [4] = 3;
            arrayIntroductory [5] = 3;
        int arrayResult [] = new int[2];
            arrayResult [0] = 3;
            arrayResult [1] = 3;
        Assertions.assertEquals(Arrays.toString(arrayResult), Arrays.toString(lessonSix.arrayOfFours(arrayIntroductory)));
    }

    @Test
    public void testTwo() {
        lessonSix = new LessonSix();
        int arrayIntroductory [] = new int[9];
        arrayIntroductory [0] = 1;
        arrayIntroductory [1] = 2;
        arrayIntroductory [2] = 4;
        arrayIntroductory [3] = 4;
        arrayIntroductory [4] = 2;
        arrayIntroductory [5] = 3;
        arrayIntroductory [6] = 4;
        arrayIntroductory [7] = 1;
        arrayIntroductory [8] = 7;
        int arrayResult [] = new int[2];
        arrayResult [0] = 1;
        arrayResult [1] = 7;
        Assertions.assertEquals(Arrays.toString(arrayResult), Arrays.toString(lessonSix.arrayOfFours(arrayIntroductory)));
    }

    @Test
    public void testTree() {
        lessonSix = new LessonSix();
        int arrayIntroductory [] = new int[6];
        arrayIntroductory [0] = 3;
        arrayIntroductory [1] = 4;
        arrayIntroductory [2] = 4;
        arrayIntroductory [3] = 1;
        arrayIntroductory [4] = 3;
        arrayIntroductory [5] = 2;
        int arrayResult [] = new int[3];
        arrayResult [0] = 1;
        arrayResult [1] = 3;
        arrayResult [2] = 2;
        Assertions.assertEquals(Arrays.toString(arrayResult), Arrays.toString(lessonSix.arrayOfFours(arrayIntroductory)));
    }
}
