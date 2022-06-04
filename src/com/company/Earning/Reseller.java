package com.company.Earning;

import com.company.Earning.Business;

public class Reseller extends Business {
    private String reselling = " reselling";
    private String salarySize = "3000";

    Business business = new Business();

    public int salary(){
     int salary = Integer.parseInt(salarySize);
        return salary;
    }

    public void SuccessPath()
    {
        System.out.println(business.earnPath + business.earnType + salarySize+"$"
                + "\n" + business.kindToEarn + business.business + reselling);
    }
}


