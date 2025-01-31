public class question5Product {
    public static void main(String[] args) {
        product laptop = new product(1, "Laptop", "Electronics", 50000);
        laptop.displayProductInfo();
        System.out.println("Total number of products: " + product.getProductCount());
        System.out.println("Stock value: " + laptop.calculateStockValue(10));
        System.out.println("Stock value after discount: " + laptop.calculateStockValue(10, 0.1f));
    }
}

class product {
    int productId;
    String productName;
    String productCategory;
    private int price;
    private static int productCount = 0;

    public product(){
        this(0, "No Name", "No Category", 0);
    }
    public product(int productId, String productName, String productCategory, int price) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.price = price;
        productCount++;
    }
    public int getPrice() {
        return price;
    }
    public void displayProductInfo(){
        System.out.printf("Product ID: %d\nProduct Name: %s\nProduct Category: %s\nProduct Price: %d\n",
                        productId, productName, productCategory, price);
    }
    public static int getProductCount() {
        return productCount;
    }
    public float calculateStockValue(int quantity) {
        return price * quantity;
    }
    public float calculateStockValue(int quantity, float discount) {
        return (price * quantity)*(1-discount);
    }
}