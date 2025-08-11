class GreatestNum{
    public void GreatestChecker(int[] numbers){
        for(int n:numbers){
            System.out.print(n+" ");
        }
        System.out.println();
        int max=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("Greatest number is: "+max);
    }

}

public class GreatestNumber {
    public static void main(String[] args){
        int[] nums={10,30,5,7,9,8,33,55,76,99};
        GreatestNum num=new GreatestNum();
        num.GreatestChecker(nums);
    }
}
