package src.main.java.lesson6;

public class Example2 {
    public static void main(String[] args) {
        // 1  2  5
        // 3  7  8


        //type[lineIndex][columnIndex]

        int[][] arr1 = {{1,2,5},{3,7,8}};

        //Equals to:

        arr1[0][0]=1;
        arr1[1][1]=7;
        arr1[0][2]=5;
        //...

        System.out.println("arr1[0][0]: "+ arr1[0][0]); //Ok
        System.out.println("arr1: "+ arr1);  //Not ok

        System.out.println("-------------------------");


        //Output with 'for'
        for (int i = 0; i < 2; i++) {   //Iterating over lines
            for (int j = 0; j < 3; j++) {  //Iterating over elements in each line
                System.out.print(arr1[i][j] + "\t");
            }

            System.out.println();
        }


    }
}
