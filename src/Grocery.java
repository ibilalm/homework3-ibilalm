public class Grocery extends Item implements Tax, Discount{
    private double price;
    private double units;
    private double discounts;
    private double tax;
    Grocery( int itemCode, String Name, double units, double price, double discounts, double tax) {
        super(itemCode, Name);
        this.price = price;
        this.units = units;
        this.discounts = discounts;
}

    public double computeSubTotal(){
        double subTotal;
        subTotal = ((price*units)-computeDiscount());
        return  subTotal;
    }

    public double computeDiscount() {
        return (price*discounts)*units;
    }

    public double computeTax() {
        return computeSubTotal()*tax/100;
    }

    public double computeTotalPrice(){
        double TotalPrice;
        tax = computeTax();
        TotalPrice = computeSubTotal()-discounts+tax;
        return TotalPrice;
    }

    public void displayGrocery(){
        System.out.println("");
        System.out.println("GROCERY ITEM:");
        System.out.println("Item Code: "+ getItemCode());
        System.out.println("Name: "+ getName());
        System.out.println("Unit Price: "+ price);
        System.out.println("Units: "+ units);
        System.out.println("Savings: "+ computeDiscount());
        System.out.println("SubTotal: "+ computeSubTotal());
        System.out.println("Tax Amount: "+ computeTax());
        System.out.println("Final Price: "+ computeTotalPrice());
    }

}
