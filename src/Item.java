public class Item {
    private int itemCode;
    private String Name;
    Item(int itemCode, String Name) {
        this.itemCode = itemCode ;
        this.Name = Name;
    }
    public int getItemCode(){
        return itemCode;
    }
    public String getName(){
        return Name;
    }


}
