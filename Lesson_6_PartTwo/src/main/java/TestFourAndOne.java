import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class TestFourAndOne {

        private LessonSixTwo lessonSixTwo;

        @Test
        public void testOne() {
            lessonSixTwo = new LessonSixTwo();
            int arrayIntroductory [] = new int[3];
            arrayIntroductory [0] = 1;
            arrayIntroductory [1] = 4;
            arrayIntroductory [2] = 4;
            Assertions.assertTrue(lessonSixTwo.CheckFourAndOne(arrayIntroductory));
        }

    @Test
    public void testTwo() {
        lessonSixTwo = new LessonSixTwo();
        int arrayIntroductory [] = new int[3];
        arrayIntroductory [0] = 1;
        arrayIntroductory [1] = 2;
        arrayIntroductory [2] = 4;
        Assertions.assertTrue(lessonSixTwo.CheckFourAndOne(arrayIntroductory));
    }

    @Test
    public void testTree() {
        lessonSixTwo = new LessonSixTwo();
        int arrayIntroductory [] = new int[3];
        arrayIntroductory [0] = 1;
        arrayIntroductory [1] = 1;
        arrayIntroductory [2] = 1;
        Assertions.assertTrue(lessonSixTwo.CheckFourAndOne(arrayIntroductory));
    }

}
