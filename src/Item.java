public class Item {
    private String Name;
    private int itemCode;

    public Item(String n, int c){
        Name = n;
        itemCode = c;
    }
    public void display(){
        System.out.println("Product name: "+Name);
        System.out.println("Product code: "+itemCode);
    }

    interface Discount {
        public double computeDiscount();
    }

    interface Tax {
        public double computeTax();
    }

}
