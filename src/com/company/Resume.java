package com.company;

import java.util.ArrayList;

public class Resume {
    private String name;
    private String email;
    private ArrayList<Education> educationList = new ArrayList<>();
    private ArrayList<Experience> experiences = new ArrayList<>();
    private ArrayList<Skill> skills = new ArrayList<>();

    public Resume(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addEducation(Education edu){
        educationList.add(edu);
    }

    public String getEducation(int i){
        return educationList.get(i).toString();
    }

    public void addExperiences(Experience ex){
        experiences.add(ex);
    }

    public String getExperience(int i){
        return experiences.get(i).toString();
    }

    public void addSkill(Skill skill){
        skills.add(skill);
    }

    public String getSkill(int i){
        return skills.get(i).toString();
    }

    private String getEducationList() {
        String rStr="";//return String
        StringBuilder sb = new StringBuilder(rStr);
        for(Education edu: educationList){
            sb.append(rStr.concat(edu.toString()+"\n"));
        }
        return sb.toString();
    }

    private String getExperienceList() {
        String rStr="";//return String
        StringBuilder sb = new StringBuilder(rStr);
        for(Experience exp: experiences){
            sb.append(rStr.concat(exp.toString()+"\n"));
        }
        return sb.toString();
    }

    private String getSkillList() {
        String rStr="";//return String
        StringBuilder sb = new StringBuilder(rStr);
        for(Skill skill: skills){
            sb.append(rStr.concat(skill.toString()+"\n"));
        }
        return sb.toString();
    }

    @Override
    public String toString(){
        return getName()+"\n"+getEmail()+"\n\nEducation\n"
                +getEducationList()+"\nExperience\n"+getExperienceList()+"\nSkills\n"+getSkillList();
    }
}
