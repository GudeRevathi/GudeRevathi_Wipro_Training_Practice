
class PrimeChecker{
    public void prime(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++){
            if (num % i == 0){
                count += 1;
            }

        }
        if(count==2)
        {
            System.out.println("The give number "+num+" is prime");
        }
        else
        {
            System.out.println("The give number "+num+ " is Not prime");
        }
    }
}
public class PrimeOrNot {
    public static void main(String[] args){

        PrimeChecker primenum=new PrimeChecker();
        primenum.prime(5);

    }
}
