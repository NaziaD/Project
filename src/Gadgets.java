public class Gadgets extends Item implements Item.Tax, Item.Discount {
    private String brand;
    private double price;
    private double units;
    private double discountpercent;
    private final double taxpercent = 8.5;

    Gadgets(String n, String b, int c, int p, int u, int d) {
        super(n, c);
        brand = b;
        price = p;
        units = u;
        discountpercent = d;
    }

    public double computeDiscount() {
        double discount = (discountpercent/100)*(price*units);
        return discount;
    }

    public double computeTax() {
        double tax = (taxpercent/100 *((price*units)-computeDiscount()));
        return tax;
    }

    public double computeTotalPrice() {
        double total = (((price * units) - computeDiscount()) + computeTax());
        return total;
    }

    public void displayGadgets() {
        display();
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Units: "+units);
        System.out.println("Subtotal: "+ (price*units));
        System.out.println("Savings: "+computeDiscount());
        System.out.println("Tax amount: "+computeTax());
        System.out.println("Final price: "+computeTotalPrice());
        System.out.println(" ");
    }
}
