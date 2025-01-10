package net.ryancave282.budgeter.subscriptions;

import net.ryancave282.budgeter.RecurringPayment;

public class Microsoft {
    public static class Microsoft365Basic extends RecurringPayment {
        public Microsoft365Basic(int dayOfMonth) {
            super(1.99, Renews.MONTHLY, dayOfMonth,null);
        }
        public Microsoft365Basic(int dayOfMonth, int Month) {
            super(19.99, Renews.YEARLY, dayOfMonth,Month);
        }
    }
    public static class Microsoft365Personal extends RecurringPayment {
        public Microsoft365Personal(int dayOfMonth) {
            super(6.99, Renews.MONTHLY, dayOfMonth,null);
        }
        public Microsoft365Personal(int dayOfMonth, int Month) {
            super(69.99, Renews.YEARLY, dayOfMonth,Month);
        }
    }
    public static class Microsoft365Family extends RecurringPayment {
        public Microsoft365Family(int dayOfMonth) {
            super(9.99, Renews.MONTHLY, dayOfMonth,null);
        }
        public Microsoft365Family(int dayOfMonth, int Month) {
            super(99.99, Renews.YEARLY, dayOfMonth,Month);
        }
    }
}
