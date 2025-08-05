package in.sandipan.foodiesapi.service;

import in.sandipan.foodiesapi.io.CartRequest;
import in.sandipan.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
