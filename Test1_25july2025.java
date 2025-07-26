import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Test1_25july2025 {

    public static void main(String[] args) {
        //q1
        ArrayList<Integer> test = new ArrayList<>();
        test.add(99);
        test.add(86);
        test.add(44);
        test.add(55);
        test.add(99);
        test.add(38);
        test.add(86);
        test.add(98);
        test.add(83);
        System.out.println("My arraylist " + test);

        Collections.sort(test);
        System.out.println("After sorting : " + test);

        System.out.println("Second Minimum element : " + test.get(1));
        System.out.println("------------------------------------------------------------------");

        //q2.coverting arraylist to hashset
        HashSet<Integer> unique = new HashSet<>(test);
        System.out.println("After keeping remaining elements as it is : " + unique);
        System.out.println("-------------------------------------------------------------------");


        //q3.
        //Collection framework : set of classes and interfaces that implements various data structurs like list
        // , maps ,sets  and manipulates it through algorithms
        ArrayList<String>  colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Red");
        colors.add("Red");
        colors.add("yellow");
        colors.add("Red");
        colors.add("Red");
        colors.add("orange");
        colors.add("green");
        colors.add("Red");
        colors.add("black");
        colors.add("black");
        colors.add("Red");
        colors.add("yellow");
        colors.add("brown");
        System.out.println("This is an arraylist : " + colors);

        LinkedList<String> subjetcs = new LinkedList<>();
        subjetcs.add("English");
        subjetcs.add("Maths");
        subjetcs.add("Physics");
        subjetcs.add("Maths");
        subjetcs.add("English");
        subjetcs.add("Chemistry");
        subjetcs.add("Genral knowledge");
        subjetcs.add("social studies");
        subjetcs.add("History");
        subjetcs.add("English");
        System.out.println("This is a linkedlist : " + subjetcs);
        System.out.println("---------------------------------------------------------------------------");

        //q4.
        ArrayList<Integer> no = new ArrayList<>();
        no.add(10);
        no.add(20);
        no.add(10);
        no.add(30);
        no.add(40);
        no.add(90);
        no.add(90);
        no.add(90);
        no.add(40);
        no.add(80);
        System.out.println("Added elements in the arraylist : " + no);
        System.out.println(no.remove(5));  //WHY PRINTING 90
        System.out.println("After removing the updating arraylist " + no);
        System.out.println("Is 80 presnt in the arraylist? " + no.contains(80));

















    }
}
