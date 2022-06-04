package com.company.Earning;

public class Worker extends Work {
    public String helper = " helper at building";
    public String salarySize = "800";

    Work work = new Work();

    public int salary(){
        int salary = Integer.parseInt(salarySize);
        return salary;
    }

    public void SuccessPath()
    {
        System.out.println(work.earnPath + work.salary + salarySize+"$"
                + "\n" + work.kindToEarn + work.work + helper);
    }
}
