package com.company.Earning;

public class Creator extends Business {
    private String creatorProduct = " create products";
    private String salarySize = "5000";
    Business business = new Business();

    public int salary(){
        int salary = Integer.parseInt(salarySize);
        return salary;
    }

    public void SuccessPath()
    {
        System.out.println("\n"+business.earnPath + business.earnType + salarySize+"$"
                + "\n" + business.kindToEarn + business.business + creatorProduct);
    }
}
