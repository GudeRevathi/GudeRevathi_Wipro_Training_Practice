package oops;

public class DigitalProductOrder extends Order{
    public DigitalProductOrder(String order_id){
        super(order_id);
    }
    void process_order(){
        System.out.println("Sending download link for order "+order_id+".");
    }
}
