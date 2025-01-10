package net.ryancave282.budgeter;

import net.ryancave282.budgeter.subscriptions.Google;

public class Budgeter {
    public Budgeter() {
        Google.YoutubePremium youtubePremium = new Google.YoutubePremium(27);
        System.out.println(youtubePremium.getNextPaymentDate());
        System.out.println(youtubePremium.getPrice());
    }
}
