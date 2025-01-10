package net.ryancave282.budgeter.subscriptions;

import net.ryancave282.budgeter.RecurringPayment;

public class Google {
     public static class YoutubePremium extends RecurringPayment {
        public YoutubePremium(int dayOfMonth) {
            super(13.99, Renews.MONTHLY, dayOfMonth,null);
        }
    }
    public static class YouTubeTV extends RecurringPayment {
          public YouTubeTV(int dayOfMonth) {
              super(72.99, Renews.MONTHLY, dayOfMonth,null);
          }
    }
}
