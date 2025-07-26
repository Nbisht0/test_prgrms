import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 10 july 2025

public class Test1 {

    //RECURSION
    /*public static int sum(int n) {
        if (n > 10) {  //this is a base case in which recursion will occur
                // upto 10 kyuki humko sirf first 5 even numbers chie( 2 * 5)

            return 0;  //agar value 10 se exceed hui to vo return 0 kar dega
        }
            if (n % 2 != 0) {
                return 0;

            } else {
                return n + sum(n + 2);
            }
        }*/




    public static void main(String[] args) {
       // System.out.println(sum( 2));


        //q1.if array contains a specific element
        //    int[]arr = { 10, 20, 30 ,40};
        //
        //        Scanner sc = new Scanner(System.in);
        //        System.out.println("enter a digit ");
        //         int integer =  sc.nextInt();
        //        boolean found = false;
        //
        //       //int  search  = arr[0];
        //        for(int i = 0 ; i < arr.length-1 ; i++ ){
        //            if (integer == arr[i]){
        //                System.out.println(" The given integer is found at index "+ i);
        //                found = true;
        //                break;
        //            }
        //        }
        //            if(!found) {
        //                System.out.println(" The given integer is not found");
        //            }
        //sc.close();


       // table of 7
/*
     int n = 7;
        System.out.println("TABLE OF 7");
     for(int i = 0 ; i <= 10 ; i++){
         System.out.println( + n + " X" + i + "=" + (n * i)  );
        }
*/


        // difference between string , string buffer , string building
          // ---> string builder is faster than string and string buffer
         //--->  string buffer is thread safe //threading hoti h


        Integer []arr = {43,47,56,57,60,2 ,91 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//sorting kiya

        Collections.reverse(Arrays.asList(arr));


        int index=Arrays.binarySearch(arr,56);
        System.out.println(index);



    }
}
