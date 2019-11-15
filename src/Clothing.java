public class Clothing extends Item implements Item.Discount, Item.Tax {
    private String brand;
    private double price;
    private double units;
    private double discountpercent;
    final double taxpercent = 8.5;

    Clothing(String n, String b, int c, int p, int u, int d) {
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
        double tax = (taxpercent/100)*(price*units);
        return tax;
    }

    public double computeTotalPrice() {
        double total = (price*units)-computeDiscount()+computeTax();
        return total;
    }

    public void displayClothing() {
        display();
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Units: "+units);
        System.out.println("Subtotal: "+ ((price*units)-computeDiscount()));
        System.out.println("Savings: "+computeDiscount());
        System.out.println("Tax amount: "+computeTax());
        System.out.println("Final price: "+computeTotalPrice());
    }
}
