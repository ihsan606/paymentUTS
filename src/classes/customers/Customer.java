package classes.customers;

public class Customer{
    private int id;
    private String name;
    private CustomerLevel level;


    public Customer(int id, String name, CustomerLevel level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerLevel getLevel() {
        return level;
    }

    public void setLevel(CustomerLevel level) {
        this.level = level;
    }

    public int countGrandTotal(int total){
        return  this.level.getPriceCalculator().countGrandTotal(total);
    }
}
