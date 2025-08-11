package pack1;

public class Pack1_Class {
    public int pack1_int;
    protected double pack1_doub;
    private String pack1_name;
    public void printData(int a,int b) {
        System.out.println("Addition is: "+(a+b));
    }
    public void setPack1Name(String name){
        this.pack1_name=name;
    }
    public String getPack1Name(){
        return this.pack1_name;
    }

}
