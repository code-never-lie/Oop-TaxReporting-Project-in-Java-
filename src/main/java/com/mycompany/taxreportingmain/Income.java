
package com.mycompany.taxreportingmain;
public class Income {

    private double employmentSalary;
    private double rentalIncome;
    private double othersIncome;

    public Income() {
        this.employmentSalary = 0.0;
        this.rentalIncome = 0.0;
        this.othersIncome = 0.0;
    }

    public Income(double employmentSalary, double rentalIncome, double othersIncome) {
        this.employmentSalary = employmentSalary;
        this.rentalIncome = rentalIncome;
        this.othersIncome = othersIncome;
    }

    public double getEmploymentSalary() {
        return employmentSalary;
    }

    public void setEmploymentSalary(double employmentSalary) {
        this.employmentSalary = employmentSalary;
    }

    public double getRentalIncome() {
        return rentalIncome;
    }

    public void setRentalIncome(double rentalIncome) {
        this.rentalIncome = rentalIncome;
    }

    public double getOthersIncome() {
        return othersIncome;
    }

    public void setOthersIncome(double othersIncome) {
        this.othersIncome = othersIncome;
    }

}
