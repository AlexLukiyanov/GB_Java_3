import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTestClass {

    public static void start(Class<?> clazz) {

        Method[] methods = BeforeSuite.class.getDeclaredMethods();
        for (Method met : methods) {
            if (met.getAnnotation(BeforeSuite.class) != null && met.getAnnotation(BeforeSuite.class).equals("BeforeSuite")) {
                System.out.println("Запуск теста Before Suite");
                testBeforeSuite(clazz);
            }
        }

            Method[] methodTest = Test.class.getDeclaredMethods();
            for (Method mTest: methodTest) {
                if(mTest.getAnnotation(Test.class) != null && mTest.getAnnotation(Test.class).equals(2)) {
                    testModificator(clazz);
                } else if (mTest.getAnnotation(Test.class) != null && mTest.getAnnotation(Test.class).equals(3)) {
                    testField(clazz);
                } else if (mTest.getAnnotation(Test.class) != null && mTest.getAnnotation(Test.class).equals(4)) {
                    testName(clazz);
                }
            }

        Method[] annotation = AfterSuite.class.getDeclaredMethods();
        for (Method annot : annotation) {
            if (annot.getAnnotation(AfterSuite.class) != null && annot.getAnnotation(AfterSuite.class).equals("AfterSuite")) {
                System.out.println("Запуск теста After Suite");
                testAfterSuite(clazz);
            }
        }
    }

    @BeforeSuite(name = "BeforeSuite")
    public static void testBeforeSuite(Class<?> clazz) {
        System.out.println("Запуск теста BeforeSuite");
    }

    @Test(priority = 2)
    public static void testModificator(Class<?> clazz) {
        final int modificator = clazz.getModifiers();
        if (Modifier.isPublic(modificator)) {
            System.out.println(clazz.getSimpleName() + " - public");
        }
        if (Modifier.isAbstract(modificator)) {
            System.out.println(clazz.getSimpleName() + " - abstract");
        }
        if (Modifier.isFinal(modificator)) {
            System.out.println(clazz.getSimpleName() + " - final");
        }
    }

    @Test(priority = 3)
    public static void testField(Class<?> clazz) {

        Field[] publicFields = clazz.getFields();
        for (Field o : publicFields) {
            System.out.println("Тип_поля Имя_поля : " + o.getType().getName() + " " + o.getName());
        }
    }

    @Test(priority = 4)
    public static void testName(Class<?> clazz) {
        System.out.println("Полное имя класса: " + clazz.getName());
        System.out.println("Простое имя класса: " + clazz.getSimpleName());
    }

    @AfterSuite(name = "AfterSuite")
    public static void testAfterSuite(Class<?> clazz) {
        System.out.println("Запуск теста BeforeSuite");
    }
}
