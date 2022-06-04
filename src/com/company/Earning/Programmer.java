package com.company.Earning;

public class Programmer extends Work {
    private String programming = " coding";
    private String salarySize = "1300";

    Work work = new Work();

    public int salary(){
        int salary = Integer.parseInt(salarySize);
        return salary;
    }

    public void SuccessPath()
    {
        System.out.println("\n"+ work.earnPath + work.salary + salarySize+"$"
                + "\n" + work.kindToEarn + work.work + programming);
    }
}
