
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 1.0);



        Item item2 = new Item("latte", 1.5);

        Item item3 = new Item("drip coffee", 2.0);


        Item item4 = new Item("capuccino", 5.0);

        // // Order variables -- order1, order2 etc.

        Order order1 = new Order();
        order1.addItem(item1);
        order1.addItem(item3);

        Order order2 = new Order();
        order2.addItem(item1);
        order2.addItem(item2);

        Order order3 = new Order("Sam");
        order3.addItem(item1);
        order3.addItem(item4);

        Order order4 = new Order("Noah");
        order4.addItem(item3);
        order4.addItem(item2);

        Order order5 = new Order("Jimmy");
        order5.addItem(item4);
        order5.addItem(item2);
        // Application Simulations
        order1.setReady(true);
        order1.getStatusMessage();

        order2.setReady(false);
        order2.getStatusMessage();

        order3.setReady(false);
        order3.getStatusMessage();

        order4.setReady(false);
        order4.getStatusMessage();

        order5.setReady(true);
        order5.getStatusMessage();

        // Use this example code to test various orders' updates
        // System.out.println(item1.getName() + item1.getPrice());
System.out.println(order1.getStatusMessage());
System.out.println(order2.getStatusMessage());

System.out.println(order1.getOrderTotal());
System.out.println(order2.getOrderTotal());
System.out.println(order3.getOrderTotal());
System.out.println(order4.getOrderTotal());
System.out.println(order5.getOrderTotal());

order1.displayMenu();
order2.displayMenu();
order3.displayMenu();
order4.displayMenu();
order5.displayMenu();
    }
}
