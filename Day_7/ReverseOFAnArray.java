class Array{
    public void ArrayReverse(int[] arr){
        int n=arr.length;
        int[] reversed=new int[n];
        for(int i=0;i<n;i++){
            reversed[i]=arr[n-1-i];
        }
        for(int num:reversed){
            System.out.print(num+" ");
        }

    }

}
public class ReverseOFAnArray {
    public static void main(String[] args){
        Array array=new Array();
        int[] original={10,20,30,40};
        array.ArrayReverse(original);
    }
}
