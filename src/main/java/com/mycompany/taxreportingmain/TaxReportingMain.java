
package com.mycompany.taxreportingmain;

import java.util.Scanner;

public class TaxReportingMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //user object creation
        System.out.println("**INCOME**");
        Income income = new Income();
        System.out.println("Enter EmploymentSalary : RM");
        double Salary = input.nextDouble();
        income.setEmploymentSalary(Salary);

        System.out.println("Enter RentalIncome : RM");
        double RentalIncome = input.nextDouble();
        income.setRentalIncome(RentalIncome);

        System.out.println("Enter OthersIncome : RM");
        double OthersIncome = input.nextDouble();
        income.setOthersIncome(OthersIncome);

        System.out.println("**EXEMPTION**");

        //user object creation
        Exemption exemption = new Exemption();

        System.out.print("Enter Donation: RM");
        double Donation = input.nextDouble();
        exemption.setDonation(Donation);

        System.out.print("Enter Monthly taxde duction: RM");
        double monthly_tax_deduction = input.nextDouble();
        exemption.setDonation(monthly_tax_deduction);

        System.out.print("Enter insurance: RM");
        double insurance = input.nextDouble();
        exemption.setDonation(insurance);

        System.out.print("Enter EPF: RM");
        double EPF = input.nextDouble();
        exemption.setDonation(EPF);

        System.out.print("Enter Zakat/Fitrah: RM");
        double Zakat = input.nextDouble();
        exemption.setDonation(Zakat);

        //data input for tax reliefs (Exemption) & tax rebate
        System.out.println("**TAX SUMMARY**");
        //output data for tax summary
        
         //user object creation
        TaxPayer taxPayer= new TaxPayer("Ali","SG001212","Individual","20 March 2022");
        taxPayer.display();
    }
}

