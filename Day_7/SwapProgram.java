class SwapTwoNum{
    public void Swap(int a, int b){
        System.out.println("Before Swaping: a= "+a+" , b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Ater Swaping: a= "+a+" , b= "+b);
    }
}

public class SwapProgram {
    public static void main(String[] args){
        SwapTwoNum swapnum=new SwapTwoNum();
        swapnum.Swap(5,10);

    }
}
