package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {
    public static void main(String[] args) {
        int n = 5;
//        ArrayList<Integer> arr = new ArrayList<>(5);
        LinkedList<Integer> arr = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            arr.add(i);

        }
        System.out.println(arr + ", ");


        arr.remove(3);

        System.out.println(arr + " ");
//
//
//        arr.add(9);
//
//        System.out.println(arr + " ");
//
//
//        arr.add(1, 9);
//
//        System.out.println(arr + " ");
//
//
//        System.out.println("Is empty: "+ arr.isEmpty());
//
//
//        arr.set(0, 100);
//
//        System.out.println(arr + " ");
//
//
//        arr.clear();
//
//        System.out.println(arr + " ");


    }
}
