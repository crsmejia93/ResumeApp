package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Resume {
    private String name;
    private String email;
    private String phone;
    private ArrayList<Education> educationList = new ArrayList<>();
    private ArrayList<Experience> experiences = new ArrayList<>();
    private ArrayList<Skill> skills = new ArrayList<>();

    public Resume() {
    }

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

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void addEducation(Education edu){
        educationList.add(edu);
    }

    public Education getEducation(int i){
        return educationList.get(i);
    }

    public void addExperiences(Experience ex){
        experiences.add(ex);
    }

    public Experience getExperience(int i){
        return experiences.get(i);
    }

    public void addSkill(Skill skill){
        skills.add(skill);
    }

    public Skill getSkill(int i){
        return skills.get(i);
    }

    public void changeInfo(String newInfo){
        Scanner input = new Scanner(System.in);
        switch (newInfo.toLowerCase()){
            case "name":
                System.out.print("Please enter the new name: ");
                setName(input.nextLine());
                break;
            case "email":
                System.out.print("Please enter the new email: ");
                setEmail(input.nextLine());
                break;
            case "phone":
                System.out.print("Please enter the new phone number: ");
                setPhone(input.nextLine());
                break;
        }
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
        String rStr="";
        rStr = getName()+"\n"+getEmail()+"\n"+getPhone()+"\n";
        if(!educationList.isEmpty()){
            rStr=rStr.concat("\n\nEducation\n"
                    +getEducationList());
        }
        if(!experiences.isEmpty()){
            rStr=rStr.concat("\nExperience\n"+getExperienceList());
        }
        if(!skills.isEmpty()){
            rStr=rStr.concat("\nSkills\n"+getSkillList());
        }
        return rStr;
    }
}
