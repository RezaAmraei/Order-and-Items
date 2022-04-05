
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        // item1.setName("mocha");
        // item1.setPrice(1.0);
        item1.name = "mocha";
        item1.price = 1.0;

        Item item2 = new Item();
        // item2.setName("latte");
        // item2.setPrice(1.5);
        item2.name = "latte";
        item2.price = 1.5;
        Item item3 = new Item();
        // item3.setName("drip coffee");
        // item3.setPrice(2.0);
        item3.name = "drip coffee";
        item3.price = 2.0;

        Item item4 = new Item();
        // item4.setName("capuccino");
        // item4.setPrice(5.0);
        item4.name = "capuccino";
        item4.price = 5.0;
        // // Order variables -- order1, order2 etc.

        Order order1 = new Order();
        order1.name = "Cindhuri";
        // order1.setName("Cindhuri");
        // order1.setTotal();
        // order1.setReady(ready);

        Order order2 = new Order();
        order2.name = "Jimmy";
        // order1.setName("Jimmy");
        // order1.setTotal(item1.getPrice());
        // order1.setReady(ready);

        Order order3 = new Order();
        order3.name = "Noah";
        // order1.setName("Noah");
        // order1.setTotal();
        // order1.setReady(ready);

        Order order4 = new Order();
        order4.name = "Sam";
        // order1.setName("Sam");
        // order1.setTotal();
        // order1.setReady(ready);

        // Application Simulations
        order2.items.add(item1);
        order2.total += item1.price;

        order3.items.add(item4);
        order3.total += item4.price;

        order4.items.add(item2);
        order4.total += item2.price;

        order1.ready = true;

        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;

        order2.ready = true;
        // Use this example code to test various orders' updates
        // System.out.println(item1.getName() + item1.getPrice());
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
    
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
