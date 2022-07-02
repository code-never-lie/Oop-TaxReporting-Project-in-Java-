
package com.mycompany.taxreportingmain;

public class EFiling implements EzHasil {

    protected String submittionDate;   //protected data member
    protected String assessmentType;

    public EFiling(String submittionDate, String assessmentType) {
        this.submittionDate = submittionDate;
        this.assessmentType = assessmentType;
    }

    protected void setSubmittionDate(String submittionDate) {
        this.submittionDate = submittionDate;
    }

    protected String getSubmittionDate() {
        return submittionDate;
    }

    protected void setAssessmentType(String assessmentType) {
        this.assessmentType = assessmentType;
    }

    protected String getAssessmentType() {
        return assessmentType;
    }

    @Override
    public double calculateTotalIncome() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double calculateTotalExemption() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double calculateTaxableIncome() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
