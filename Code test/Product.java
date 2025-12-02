public class Product {
    int productId;

    Product(int productId) {
        this.productId = productId;
    }

    void showDetails() {
        System.out.println("Product ID: " + productId);
    }

    public static void main(String[] args) {
        Electronics e1 = new Electronics(101, 2);
        e1.showDetails();
    }
}

class Electronics extends Product {
    int warranty;

    Electronics(int productId, int warranty) {
        super(productId);  
        this.warranty = warranty;
    }

    @Override
    void showDetails() {
        super.showDetails(); 
        System.out.println("Warranty (years): " + warranty);
    }
}
