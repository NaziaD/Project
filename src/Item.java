public class Item {
    private String itemName;
    private int itemCode;

    public Item(String name, int code){
        itemName = name;
        itemCode = code;
    }
    public void display(){
        System.out.println("The product name is: "+itemName);
        System.out.println("The product code is: "+itemCode);
    }

    interface Discount{
        public double computeDiscount();
    }

    interface Tax{
        public double computeTax();
    }

}
