public class Grocery extends Item implements Item.Discount, Item.Tax {
    private double price;
    private double units;
    private double discountpercent;
    private final double taxpercent = 0.0;

    Grocery(String n, int c, double p, double u, double d) {
        super(n, c);
        price = p;
        units = u;
        discountpercent = d;
    }

    public double computeDiscount() {
        double discount = (discountpercent/100)*(price*units);
        return discount;
    }

    public double computeTax() {
        double tax = (taxpercent/100 *(price*units));
        return tax;
    }

    public double computeTotalPrice() {
        double total = (((price * units) - computeDiscount()) + computeTax());
        return total;
    }
    public void displayGrocery() {
        display();
        System.out.println("Price: "+price);
        System.out.println("Units: "+units);
        System.out.println("Subtotal: "+ (price*units));
        System.out.println("Savings: "+computeDiscount());
        System.out.println("Tax amount: "+computeTax());
        System.out.println("Final price: "+computeTotalPrice());
        System.out.println(" ");
    }
}
