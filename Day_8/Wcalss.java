public class Wcalss {
    public static void main(String[] args){
        System.out.println("Using parseBoolean----------------");
        String str1="True";
        String str2="false";
        boolean b1=Boolean.parseBoolean(str1);
        boolean b2=Boolean.parseBoolean(str2);
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("Using valueOf()--------------------");
        Boolean b3=Boolean.valueOf(str1);
        System.out.println(b3);


        System.out.println("Using booleanValue--------------------");
        boolean b4 = b3.booleanValue();
        System.out.println(b4);
    }
}
