
package com.mycompany.taxreportingmain;

public class TaxPayer extends EFiling {

    protected String name;
    protected String taxNo;
    private double taxRebate;
    private Income Income;
    private Exemption exemption;

    public TaxPayer(String name, String taxNo, String submittionDate, String assessmentType) {
        super(submittionDate, assessmentType);
        this.name = name;
        this.taxNo = taxNo;
        this.taxRebate = 0;
        this.Income = Income;
        this.exemption = exemption;
        Income = new Income();
        exemption = new Exemption();
    }

    @Override
    public double calculateTotalExemption() {
        double Total_Exemption;
        Total_Exemption = exemption.getDonation() + exemption.getInsurance() + exemption.getEpf();
        return Total_Exemption;
    }

    @Override
    public double calculateTotalIncome() {
        double Total_Income;
        Total_Income = Income.getEmploymentSalary() + Income.getRentalIncome() + Income.getOthersIncome();
        return Total_Income;
    }

    @Override
    public double calculateTaxableIncome() {
        double Taxable_Income;
        double Individual_Exemption = exemption.getDonation() + exemption.getMonthly_tax_deduction() + exemption.getInsurance() / exemption.getEpf();
        Taxable_Income = calculateTotalIncome() - (calculateTotalExemption() + Individual_Exemption);
        return Taxable_Income;
    }

    public double calculateIncomeTaxAmount() {

        double Income_Tax_Amount;
        double Base_Tax = 0;
        double Tax_Rate = 0;
        double Chargeable_Income = 0;
        if (calculateTaxableIncome() < 5000) {
            Chargeable_Income = 5000;
            Base_Tax = 0;
            Tax_Rate = 0;

        }
        if (calculateTaxableIncome() < 20000) {
            Chargeable_Income = 20000;
            Base_Tax = 0;
            Tax_Rate = 1;

        }
        if (calculateTaxableIncome() < 35000) {
            Chargeable_Income = 35000;
            Base_Tax = 150;
            Tax_Rate = 3;

        }
        if (calculateTaxableIncome() < 50000) {
            Chargeable_Income = 50000;
            Base_Tax = 600;
            Tax_Rate = 5;

        }
        Income_Tax_Amount = Base_Tax + ((calculateTaxableIncome() - Chargeable_Income) * Tax_Rate);
        return Income_Tax_Amount;
    }

    public double amountOfTaxCharged() {
        double Tax_Charged;
        double Tax_Rebate = exemption.getZaka();
        Tax_Charged = calculateIncomeTaxAmount() - Tax_Rebate;
        return Tax_Charged;
    }

    public double taxToBePaid() {
        double Tax_To_Be_Paid;
        Tax_To_Be_Paid = amountOfTaxCharged() - exemption.getMonthly_tax_deduction();
        return Tax_To_Be_Paid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public double getTaxRebate() {
        return taxRebate;
    }

    public void setTaxRebate(double taxRebate) {
        this.taxRebate = taxRebate;
    }

    public Income getIncome() {
        return Income;
    }

    public void setIncome(Income Income) {
        this.Income = Income;
    }

    public Exemption getExemption() {
        return exemption;
    }

    public void setExemption(Exemption exemption) {
        this.exemption = exemption;
    }

    void display() {

        System.out.print("Tex Payer Name" + getName());
        System.out.print("Tex Number" + getTaxNo());
        System.out.print("GetSubmittionDate" + getSubmittionDate());
        System.out.print("Total Annual Incom RM:" + calculateTotalIncome());
        System.out.print("Total Annual Exemption RM:" + calculateTotalExemption());
        System.out.print("Texable Ammount RM:" + calculateTaxableIncome());
        System.out.print("Income  Tex Ammount RM:" + calculateIncomeTaxAmount());
        System.out.print("Ammount of Tex charges RM:" + amountOfTaxCharged());
        System.out.print("Ammount of Tex (To be paid) or (Refund with symbol) RM:" + amountOfTaxCharged());
    }
}
