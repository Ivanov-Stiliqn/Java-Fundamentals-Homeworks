package Problem_02;

import java.math.BigDecimal;

public abstract class ElectronicsProduct extends Product {
    private int guaranteePeriod;

    public ElectronicsProduct(String name, BigDecimal price, int quantity,
                             AgeRestriction restriction, int guaranteePeriod) {
        super(name, price, quantity, restriction);
        this.setGuaranteePeriod(guaranteePeriod);
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        if (guaranteePeriod < 0) {
            throw new IllegalArgumentException("Guarantee period must be positive!");
        }
        this.guaranteePeriod = guaranteePeriod;
    }

    @Override
    public abstract BigDecimal getPrice();

    @Override
    public String toString(){
        String str = super.toString() +
                "\nGuarantee period: " + this.guaranteePeriod;

        return str;
    }
}