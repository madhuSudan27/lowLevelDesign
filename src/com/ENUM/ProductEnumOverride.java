package com.ENUM;

public enum ProductEnumOverride {
    ELECTRONICS {
        @Override
        public double getDiscount(double price) {
            return price * 0.90; // 10% off
        }
    },
    CLOTHING {
        @Override
        public double getDiscount(double price) {
            return price * 0.80; // 20% off
        }
    },
    KITCHEN {
        @Override
        public double getDiscount(double price) {
            return price * 0.95; // 5% off
        }
    };

    // Abstract method - each constant MUST override this
    public abstract double getDiscount(double price);
}


enum ProductType {
    ELECTRONICS {
        @Override
        public double getDiscount(double price) {
            return price * 0.90;
        }
    },
    CLOTHING,  // Uses default
    KITCHEN;   // Uses default

    public double getDiscount(double price) {
        return price * 0.95; // default
    }
}

