import java.util.Arrays;
public class SearchingAndFilling {
    public static void main(String[] args){
        int[] arr=new int[3];
        arr[0]=2;
        arr[1]=5;
        arr[2]=7;
        int index=Arrays.binarySearch(arr,7);
        System.out.print(index);
        int[] arr1=new int[4];
        Arrays.fill(arr1,6);
        System.out.println(Arrays.toString(arr1));

    }
}
