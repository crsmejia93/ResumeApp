package com.company;

public class Experience{
    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String description;

    public Experience() {
    }

    public Experience(String company, String jobTitle, String startDate, String endDate, String description) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return getJobTitle()+"\n"+getCompany()+
                ", "+getStartDate()+"-"+getEndDate()+"\n"+getDescription()+"\n";
    }
}
