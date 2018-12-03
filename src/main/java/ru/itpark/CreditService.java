package ru.itpark;

public class CreditService {
    public int calculateCredit(int creditAmount, int creditTerm, double creditPercentage ) {
        double monthlyLoanInterestRate = (creditPercentage / 12) / 100; //месячная процентная ставка по кредиту (= годовая ставка / 12)
        double annuityRatio = (monthlyLoanInterestRate * Math.pow(1+monthlyLoanInterestRate, creditTerm)) / (Math.pow(1+monthlyLoanInterestRate, creditTerm) - 1);// коэффициент аннуитета
        int annuityPayment = (int)Math.ceil(annuityRatio * creditAmount);// ежемесячный аннуитетный платёж
        return annuityPayment;
    }
}