package Java2_06.giftmodel;

public class Gift {
    private int id;
    private String name;
    private double price;
    private  int qty;
    public Gift(){};
    public Gift(int id, String name, double price, int qty){
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQty(){
        return this.qty;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public void setQty(int qty){
        this.qty = qty;
    }


}
