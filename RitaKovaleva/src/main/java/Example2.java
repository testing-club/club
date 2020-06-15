package lesson_3;

public class Example2 {
    public static void main(String[] args) {
        int [] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 3;
        arr1[2] = 5;
        arr1[3] = 7;
        arr1[4] = 9;
        System.out.println(arr1);


//        for ( ; ; ) {
//
//        }
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("-----------");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
