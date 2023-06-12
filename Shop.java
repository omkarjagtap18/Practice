public class Shop {
    private String name;
    private String address;
    private double totalSales;

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
        this.totalSales = 0.0;
    }

    public void makeSale(double amount) {
        if (amount > 0) {
            totalSales += amount;
            System.out.println("Sale of $" + amount + " recorded.");
        } else {
            System.out.println("Invalid sale amount.");
        }
    }

    public void printShopDetails() {
        System.out.println("Shop Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Total Sales: $" + totalSales);
    }
    
    public static void main(String[] args) {
        // Create a shop object
        Shop shop = new Shop("MyShop", "123 Main Street");

        // Make some sales
        shop.makeSale(50.0);
        shop.makeSale(75.0);
        shop.makeSale(100.0);

        // Print shop details
        shop.printShopDetails();
    }
}


