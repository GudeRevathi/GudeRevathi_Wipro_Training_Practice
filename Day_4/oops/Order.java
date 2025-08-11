package oops;

abstract class Order {
    protected String order_id;

    public Order(String order_id){
        this.order_id=order_id;
    }
    //abstract method
    abstract void process_order();
    //concrete method
    public void print_order_summary(){
        System.out.println("Order "+order_id+" summary printed.");
    }
}
