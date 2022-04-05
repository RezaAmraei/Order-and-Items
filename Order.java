import java.util.ArrayList;
public class Order{
    // private String name;
    // private double total;
    // private boolean ready;
    // private ArrayList<Item> items;
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getTotal(){
        return total;
    }
    public void setTotal(double total){

        this.total = total;
    }
    public boolean getReady(){
        return ready;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }

    public void addItem(Item item){
        this.items.add(item);
    }
    public String getStatusMessage(){
        String readyString = "Your order is ready.";
        String notReady = "Thank you for waiting. Your order will be ready soon.";
        if(this.ready){
            return readyString;
        }else{
            return notReady;
        }
    }
    public double getOrderTotal(){
        for(int i = 0; i < this.items.size(); i++){
            this.total += this.items.get(i).getPrice();
        }
        return this.total;
    }
    public void displayMenu(){
        System.out.println("Customer Name: " + this.name);
        for(Item item : items){
            System.out.println(item.getName() + " - $"+ item.price);
        }
        System.out.println(this.total);
    }
}