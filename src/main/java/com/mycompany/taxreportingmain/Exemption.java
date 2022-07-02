
package com.mycompany.taxreportingmain;
public class Exemption {

    private double donation;
    private double monthly_tax_deduction;
    private double insurance;
    private double epf;
    private double Zaka;

    public Exemption() {
        this.donation = 0.0;
        this.monthly_tax_deduction = 0.0;
        this.insurance = 0.0;
        this.epf = 0.0;
        this.Zaka = 0.0;
    }

    public Exemption(double donation, double monthly_tax_deduction, double insurance, double epf,double Zaka) {
        this.donation = donation;
        this.monthly_tax_deduction = monthly_tax_deduction;
        this.insurance = insurance;
        this.epf = epf;
        this.Zaka = Zaka;
    }

    public double getDonation() {
        return donation;
    }

    public double getZaka() {
        return Zaka;
    }

    public void setZaka(double Zaka) {
        this.Zaka = Zaka;
    }

    public void setDonation(double donation) {
        this.donation = donation;
    }

    public double getMonthly_tax_deduction() {
        return monthly_tax_deduction;
    }

    public void setMonthly_tax_deduction(double monthly_tax_deduction) {
        this.monthly_tax_deduction = monthly_tax_deduction;
    }

    public double getInsurance() {
        return insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public double getEpf() {
        return epf;
    }

    public void setEpf(double epf) {
        this.epf = epf;
    }

}
