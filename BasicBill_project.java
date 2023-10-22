import java.util.HashMap;
import java.util.Scanner;

import java.lang.String;

class BasicBill {
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    HashMap<String,Billitem>billitems=new HashMap<>();
    double subtotal=0.0;
    boolean done =false;
    System.out.println("enter the item name or done : ");
    String item_name=scan.nextLine();
    if ("done".equalsIgnoreCase(item_name)){
        done=true;
    }
    else{
        System.out.println("enter the price: ");
        double item_price=scan.nextDouble();
        System.out.println("enter the quantiy: ");
        int item_quant=scan.nextInt();
        Billitem item=new Billitem(item_name,item_price,item_quant);
        billitems.put(item_name,item);
        for (Billitem items:billitems.values()){
            subtotal+=items.getTotal_cost();
        }
    System.out.println("enter the tax amount: ");
    double tax=scan.nextDouble();
    System.out.println("enter discount amount");
           double discount=scan.nextDouble();
           double total_Bill_amount=subtotal+tax+discount;
           System.out.println("----------Bill---------------");
           for(Billitem items:billitems.values()){
            System.out.println("ItemName "+" Item_Qunatity "+" Total_Cost__");
            System.out.println(item.getName()+"      "+item.getQuantity()+"        "+item.getTotal_cost());
           }
           
    }
}
static class Billitem{
    private String name;
    private double price;
    private int quant;



    public  Billitem(String name,double price,int quant){
        this.name=name;
        this.price=price;
        this.quant=quant;

    }

    public String getName(){
        return this.name;
    }

    public Double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quant;
    }

    public double getTotal_cost(){
        return price*quant;
    }

}

}

