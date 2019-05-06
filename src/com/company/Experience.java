package com.company;

import java.util.ArrayList;

public class Experience{
    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String description;
    //ArrayList<String> descriptions = new ArrayList<>();

    public Experience() {
    }

    public Experience(String company, String jobTitle, String startDate, String endDate, String description) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description=description;
    }
//    public Experience(String company, String jobTitle, String startDate, String endDate, String description1, String description2) {
//        this.company = company;
//        this.jobTitle = jobTitle;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        descriptions.add(description1);
//        descriptions.add(description2);
//    }

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

    public void addDescription(String description) {
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

//    public String getDescriptionList(){
//        String rStr="";//return String
//        int counter=1;
//        StringBuilder sb = new StringBuilder(rStr);
//        for(String desc: descriptions){
//            sb.append("-Duty"+counter+", "+rStr.concat(desc+"\n"));
//            counter++;
//        }
//        return sb.toString();
//    }
    @Override
    public String toString(){
        return getJobTitle()+"\n"+getCompany()+
                ", "+getStartDate()+"-"+getEndDate()+"\n"+getDescription();
    }
}
