package com.company;

import java.util.HashMap;

public class Recruiter {
    private HashMap<String, Resume> inqueries = new HashMap<>();

    public Recruiter(){}

    public void addFoundResume(String resumeName,Resume resume){
        inqueries.put(resumeName, resume);
    }

    public Resume getFoundResume(String resumeName){
        return inqueries.get(resumeName);
    }

    public String getFoundResumeList(){
        String rStr="";//return string
        StringBuilder sb = new StringBuilder(rStr);
        for(Resume resume: inqueries.values()){
            sb.append(resume.toString()+"\t");
        }
        return sb.toString();
    }
}
