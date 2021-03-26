package geekbrains.aleksandrphilimonov.task1;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        MyClass<Float> num1 = new MyClass<>(1.9f);
        MyClass<Float> num2 = new MyClass<>(5.4f);
        Integer[] array1 = {1, 2};
        String[] array2 = {"one","two"};
        Boolean[] array3 = {true, false};
        MyClass[] array4 = {num1,num2};

        System.out.println(Arrays.toString(array1));
        changeItem(array1);
        System.out.println(Arrays.toString(array1));

        System.out.println(Arrays.toString(array2));
        changeItem(array2);
        System.out.println(Arrays.toString(array2));

        System.out.println(Arrays.toString(array3));
        changeItem(array3);
        System.out.println(Arrays.toString(array3));

        System.out.println(Arrays.toString(array4));
        changeItem(array4);
        System.out.println(Arrays.toString(array4));

    }

    public static <T> void changeItem(T[] array) {
        T temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
