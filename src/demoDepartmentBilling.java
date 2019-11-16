public class demoDepartmentBilling {
    public static void main(String args[]){
        Grocery item1 = new Grocery("Bread",11,1.50,2,0);
        Grocery item2 = new Grocery("Apple",12,0.75,6,1);

        Clothing item3 = new Clothing("Jeans","Levis",21,35,1,0);
        Clothing item4 = new Clothing("Dress Shirt","Izod",22,25,2,10);

        item1.displayGrocery();
        item2.displayGrocery();
        item3.displayClothing();
        item4.displayClothing();
        System.out.println("Total Bill Amount: "+(item1.computeTotalPrice()+item2.computeTotalPrice()+item3.computeTotalPrice()+item4.computeTotalPrice()));
    }

}
