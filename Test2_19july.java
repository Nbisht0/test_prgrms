// ----> import java.util.Scanner;


public class Test2_19july {
    public static void main(String[] args) {

        // q1. ----> project3

        // q2.
        System.out.println("--------------------Q2--------------------------------");

        mother maa = new mother(100);
        maa.recipe();
        System.out.println("GRANDMA  has : " + maa.getMoney(100) + " rupees ");
        System.out.println("MAMMA  has : " + maa.coins + " coins ");
        System.out.println("                                                      ");


        // q3.
        System.out.println("---------------------Q3-----------------------------");

        college clg = new college();
        clg.name();
        president pres = new president();
        pres.work();
        vice_chanceller vice = new vice_chanceller();
        vice.corruption();
        deen dean = new deen();
        dean.nam();
        hod head = new hod();
        head.hod_name();
        System.out.println("                                                 ");

        // q4.
        System.out.println("----------------q4--------------------------");

        siblings sib = new siblings("eena" , "meena" , "teena");
        System.out.println("name of the first child : " + sib.child1);
        System.out.println("name of the second child : " + sib.child2);
        System.out.println("name of the third child : " + sib.child3);






    }
}

//q1

// q2. major difference
// abstraction : is a concept in which we hides the implement details and only show what's necessary
// encapsulation : is binding of data and methods when one can access it whenever needed

abstract class grandmother{
   private int money;
    abstract void recipe();

}
class mother extends grandmother{
    public int coins;
    public mother(int coins){
        this.coins = coins;

    }

    public int money;
    public int getMoney(int money){
        return 1000;
    }



    @Override
    void recipe(){
        System.out.println("Mumma knows every secret recipe of grandmaa");
    }

}

//q3.
class college{
    void name(){
        System.out.println("COLLEGE NAME : Women's Institute of Technology");
    }
}
class president extends college{
    void work(){
        System.out.println("Manages the campus ");
    }
}
class vice_chanceller extends college{
    void corruption(){
        System.out.println("Doesn't support corruption");
    }
}
class deen extends college{
    void nam(){
        System.out.println("Deen name is : Mr.Ankur Dumka");
    }
}
class hod extends college{
    void hod_name(){
        System.out.println("HOD of CSE Department : Mrs. Shilpi mittal");
    }
}

//q4.

class siblings{
    String child1;
    String child2;
    String child3;

    public siblings(String child1 ,String child2 ,String child3){
        this.child1 = child1;
        this.child2 = child2;
        this.child3 = child3;
    }




}