public class Clothing extends Item implements Tax, Discount{
    private String brand;
    private double price;
    private double units;
    private double discount;
    final double taxp=8.5;
    Clothing(int itemCode, String Name, double units, double price, String brand, double discount){
        super(itemCode, Name);
        this.brand = brand;
        this.price = price;
        this.units = units;
        this.discount = discount;
}

    public double computeSubTotal(){
        double subTotal;
        subTotal = ((price*units)-computeDiscount());
        return subTotal;

    }

    public double computeDiscount() {
        return (price*discount)*units;
    }

    public double computeTax() {
        return computeSubTotal()*taxp/100;
    }

    public double computeTotalPrice(){
        double TotalPrice;
        double tax;
        tax = computeTax();
        TotalPrice = computeSubTotal()+tax;
        return TotalPrice;
    }

    public void displayClothing(){
        System.out.println("");
        System.out.println("CLOTHING ITEM:");
        System.out.println("Item Code: "+ getItemCode());
        System.out.println("Name: "+ getName());
        System.out.println("Brand: "+ brand);
        System.out.println("Unit Price: "+ price);
        System.out.println("Units: "+ units);
        System.out.println("SubTotal: "+ computeSubTotal());
        System.out.println("Savings: "+ computeDiscount());
        System.out.println("Tax Amount: "+ computeTax());
        System.out.println("Final Price: "+ computeTotalPrice());
    }
}
