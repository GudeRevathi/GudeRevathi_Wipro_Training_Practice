package oops;

public class ServiceOrder extends Order{
    public ServiceOrder(String order_id){
        super(order_id);
    }
    void process_order(){
        System.out.println("Scheduling service for order "+order_id+".");
    }
}
