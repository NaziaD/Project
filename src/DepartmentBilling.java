public class demoDepartmentBilling {
    public static void main(String[] args){
        double total;
        Grocery item1 = new Grocery("Bread",1,1.50,20,0);
        Grocery item2 = new Grocery("Apple",2,0.75,16,1);

        Clothing item3 = new Clothing("Jeans","Levis",3,35,10,0);
        Clothing item4 = new Clothing("Dress Shirt","Izod",4,25,17,10);

        Accessories item5 = new Accessories("Earrings","Alex and Ani",5,30,10,0);
        Accessories item6 = new Accessories("Ring set","Gucci",6,250,15,0);

        Gadgets item7 = new Gadgets("Smart Watch","Samsung",7,450,5,0);
        Gadgets item8 = new Gadgets("Apple Watch","Apple",8,500,20,15);

        Utensils item9 = new Utensils("Cutlery Set","KitchenAid",9,75,4,3);
        Utensils item10 = new Utensils("Dinner Plate Set","KitchenAid",10,125,10,0);

        Furniture item11 = new Furniture("Couch","Star Furniture",11,775,2,0);
        Furniture item12 = new Furniture("Dinner Table + Chairs","Star Furniture",12,1250,3,25);

        item1.displayGrocery();
        item2.displayGrocery();
        item3.displayClothing();
        item4.displayClothing();
        item5.displayAccessories();
        item6.displayAccessories();
        item7.displayGadgets();
        item8.displayGadgets();
        item9.displayUtensils();
        item10.displayUtensils();
        item11.displayFurniture();
        item12.displayFurniture();
        total = (item1.computeTotalPrice()+item2.computeTotalPrice()+item3.computeTotalPrice()+item4.computeTotalPrice()+
                item5.computeTotalPrice()+item6.computeTotalPrice()+item7.computeTotalPrice()+item8.computeTotalPrice()+item9.computeTotalPrice()+item10.computeTotalPrice()+
                item11.computeTotalPrice()+item12.computeTotalPrice());
        if(total>1000){
            double reward = ((total/1000)*50);
            System.out.println("Rewards earned: "+reward);
            System.out.println("Total Bill Amount: "+total);
            if(reward>=1000){
                double discount = total*0.25;
                double computeddiscount = total - discount;
                System.out.println("You saved: "+discount);
                System.out.println("Total Bill Amount after savings = "+computeddiscount);
            }
        } else {
            System.out.println("Total Bill Amount: "+total);
        }
    }
}
