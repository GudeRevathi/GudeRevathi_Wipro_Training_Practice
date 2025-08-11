package oops;

public class Imp {
    public static void main(String[] args){
        Order physical = new PhysicalProductOrder("p123");
        Order digital = new  DigitalProductOrder("D123");
        Order service = new ServiceOrder("S123");

        physical.process_order();
        physical.print_order_summary();

        digital.process_order();
        digital.print_order_summary();

        service.process_order();
        service.print_order_summary();
    }
}
