package net.ryancave282.budgeter;

public class UncleSam { // TODO: make better
    public enum TaxRate {
        TEXAS(0.825);

        private double rate;
        private TaxRate(double rate) {
            this.rate = rate;
        }

        public double getRate() {
            return rate;
        }
    }

    public double getTotal(TaxRate rate, double subTotal) {
        return rate.getRate() * subTotal;
    }
}
