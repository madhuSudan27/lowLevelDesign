package com.ENUM;

public enum Product {


    ELECTRONICS(0.10),
    CLOTHING(0.20),
    KITCHEN(0.05);

    private final double discountRate;

    Product(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

//    Behind the scene compiler does something

//    public static final ProductType ELECTRONICS = new ProductType(0.10);
//    public static final ProductType CLOTHING = new ProductType(0.20);
//    public static final ProductType KITCHEN = new ProductType(0.05);


}
