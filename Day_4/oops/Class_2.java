package oops;
import pack1.Pack1_Class;

public class Class_2 {
    public static  void main(String[] args){
        Pack1_Class obj = new Pack1_Class();

        obj.printData(200, 100);

        obj.pack1_int=1234;
        System.out.println(obj.pack1_int);

//        obj.pack1_doub=99.00;
//        System.out.println(obj.pack1_doub);

        obj.setPack1Name("Revathi");
        System.out.println(obj.getPack1Name());

    }



}
