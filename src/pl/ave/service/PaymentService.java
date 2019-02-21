package pl.ave.service;

import pl.ave.model.CartItem;

import java.util.List;

public class PaymentService {
    private static final double PRICE_TO_DISCOUNT = 50;
    private static final String DISCOUNT_BRAND = "beer";

    public static void applyDiscount(List<CartItem> items){
        standardDiscount(items);
        beerDiscount(items);
    }

    private static void standardDiscount(List<CartItem> items){
        if(totalPrice(items) >= PRICE_TO_DISCOUNT){
            items.forEach(item -> item.setDiscountPrice(item.getOriginalPrice()*0.9));
        }
    }

    private static void beerDiscount(List<CartItem> items){
        items.stream()
                .filter(item -> item.getProduct().toLowerCase().contains(DISCOUNT_BRAND))
                .forEach(item -> item.setDiscountPrice(item.getDiscountPrice()*0.8));
    }

    public static double totalPrice(List<CartItem> items){
        return items.stream().mapToDouble(CartItem::getOriginalPrice).sum();
    }

    public static double totalPriceAfterDiscount(List<CartItem> items){
        return items.stream().mapToDouble(CartItem::getDiscountPrice).sum();
    }
}
