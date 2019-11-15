public class demoDepartmentBilling {
    public static void main(String[] args){
        //Scanner input = new Scanner(System.in);
        double TotalBillAmount;

        Grocery item1 = new Grocery(11,"Bread",2,1.50,0,0);
        Grocery item2 = new Grocery(12,"Apple",6,0.75,0.01,0);

        Clothing obj1 = new Clothing(21,"Jeans", 1,35,"Levis",0);
        Clothing obj2 = new Clothing(22, "Dress Shirt",2,25,"Izod",0.10);

        item1.displayGrocery();
        item2.displayGrocery();
        obj1.displayClothing();
        obj2.displayClothing();
        
        TotalBillAmount=item1.computeTotalPrice()+item2.computeTotalPrice()+obj1.computeTotalPrice()+obj2.computeTotalPrice();
        System.out.println("");
        System.out.println("Total bill amount: "+TotalBillAmount);

    }
}
