public class Grocery extends Item implements Item.Discount, Item.Tax {
    private double price;
    private double units;
    private double discountpercent;
    private double taxpercent;
    Grocery(String n, int c, double p, double u, double d, double t) {
        super(n, c);
        price = p;
        units = u;
        discountpercent = d;
        taxpercent = t;
    }

    public double computeDiscount() {
        double discount = (discountpercent/100)*price;
        return discount;
    }

    public double computeTax() {
        double tax = (taxpercent/100)*price;
        return tax;
    }

    public double computeTotalPrice() {
        double total = price-computeDiscount()+computeTax();
        return total;
    }
    public void displayGrocery() {
        display();
        System.out.println("Price: "+price);
        System.out.println("Units: "+units);
        System.out.println("Savings: "+computeDiscount());
        System.out.println("Subtotal: "+ (price-computeDiscount()));
        System.out.println("Tax amount: "+computeTax());
        System.out.println("Final price: "+computeTotalPrice());
    }
}
