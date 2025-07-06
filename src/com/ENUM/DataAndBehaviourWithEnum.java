package com.ENUM;


// now enum has data and behaviour both

public enum DataAndBehaviourWithEnum {
    ELECTRONICS("Electronics") {
        @Override
        public double getDiscount(double price) {
            return price * 0.90;
        }
    },
    CLOTHING("Clothing") {
        @Override
        public double getDiscount(double price) {
            return price * 0.80;
        }
    };

    private final String label;

    DataAndBehaviourWithEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public abstract double getDiscount(double price);
}
