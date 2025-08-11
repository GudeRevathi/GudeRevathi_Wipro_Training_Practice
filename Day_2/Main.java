//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Cal{
    int add(int n1,int n2){
        return n1+n2;
    }

}
public class Main {

    public static void main(String[] args) {
        Cal obj=new Cal();
        int res=obj.add(4,5);
        System.out.println("sum is: "+res);


    }
}