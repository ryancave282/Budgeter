package net.ryancave282.budgeter;

import java.time.LocalDate;

public class RecurringPayment {
    private final double price;
    private final Renews type;
    private final int dayOfMonth;
    private final Integer month;


    public enum Renews {
        MONTHLY,
        YEARLY;
    }

    public RecurringPayment(double price, Renews type, int dayOfMonth, Integer month) {
        this.price = price;
        this.type = type;
        this.dayOfMonth = dayOfMonth;
        this.month = month;
    }

    public LocalDate getNextPaymentDate() {
        LocalDate today = LocalDate.now();
        return switch (type) {
            case MONTHLY -> getNextPaymentDate(today, dayOfMonth);
            case YEARLY -> getNextPaymentDate(today, dayOfMonth, month);
            default -> throw new IllegalArgumentException("Unsupported frequency: " + type);
        };
    }

    public double getPrice() {
        return price;
    }

    private static LocalDate getNextPaymentDate(LocalDate today, int dayOfMonth) {
        // Current month's date
        LocalDate paymentDate = today.withDayOfMonth(Math.min(dayOfMonth, today.lengthOfMonth()));

        // If today is after the calculated date, move to the next month
        if (today.isAfter(paymentDate)) {
            paymentDate = today.plusMonths(1).withDayOfMonth(Math.min(dayOfMonth, today.plusMonths(1).lengthOfMonth()));
        }

        return paymentDate;
    }

    private static LocalDate getNextPaymentDate(LocalDate today, int dayOfMonth, int month) {
        // This year's date
        LocalDate paymentDate = LocalDate.of(today.getYear(), month, Math.min(dayOfMonth, LocalDate.of(today.getYear(), month, 1).lengthOfMonth()));

        // If today is after the calculated date, move to next year
        if (today.isAfter(paymentDate)) {
            paymentDate = LocalDate.of(today.getYear() + 1, month, Math.min(dayOfMonth, LocalDate.of(today.getYear() + 1, month, 1).lengthOfMonth()));
        }

        return paymentDate;
    }


}
