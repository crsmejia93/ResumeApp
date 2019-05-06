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

    public void searchBySkill(String keyWord, HashMap<String, Resume> resumes){
        int index =0;
        for(String resName: resumes.keySet()){
            if(resumes.get(resName).getSkill(index).getSkillName().equalsIgnoreCase(keyWord)){
                addFoundResume(resName, resumes.get(resName));
            }
        }
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
