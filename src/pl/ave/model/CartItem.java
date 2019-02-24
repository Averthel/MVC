package pl.ave.model;

public class CartItem {
    private String product;
    private double originalPrice;
    private double discountPrice;



    public CartItem(String product, double originalPrice) {
        this.product = product;
        this.originalPrice = originalPrice;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }


}
