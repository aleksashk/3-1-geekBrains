package geekbrains.aleksandrphilimonov.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array1 = {"a","b"};
        Integer[]array2 = {1,2,3};
        Float[]array3 = {4f,5f,9f};

        ArrayList<String> list1 = convertArrayToArrayList(array1);
        System.out.println(list1.getClass().getSimpleName());

        ArrayList<Integer> list2 = convertArrayToArrayList(array2);
        System.out.println(list2.getClass().getSimpleName());

        ArrayList<Float> list3 = convertArrayToArrayList(array3);
        System.out.println(list3.getClass().getSimpleName());
    }

    public static<T> ArrayList<T> convertArrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
