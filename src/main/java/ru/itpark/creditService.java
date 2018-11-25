package ru.itpark;

public class creditService {
    public int calculateCredit(double creditAmount, int creditTerm, double creditPercentage ) {
        int annuityPayment = 0; // ежемесячный аннуитетный платёж
        double annuityRatio = 0; // коэффициент аннуитета
        double monthlyLoanInterestRate = (creditPercentage / 12) / 100; //месячная процентная ставка по кредиту (= годовая ставка / 12)
        annuityRatio = (monthlyLoanInterestRate * Math.pow(1+monthlyLoanInterestRate, creditTerm)) / (Math.pow(1+monthlyLoanInterestRate, creditTerm) - 1);
        annuityPayment = (int)Math.ceil(annuityRatio * creditAmount);
        return annuityPayment;
    }
}