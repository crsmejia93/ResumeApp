package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<String, Resume> resumes = new HashMap<>();//this will keep track of the resumes created

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input="y";
        String resumeName;
        String addEdu, addExp, addSkill;
        while(!input.equalsIgnoreCase("n")){
            System.out.print("Would you like to create a resume(y/n): ");
            input = kb.nextLine();
            if(input.equalsIgnoreCase("y")) {
                addEdu = "y";
                addExp="y";
                addSkill="y";
                System.out.print("Please enter the name of your resume: ");
                resumeName = kb.nextLine();
                resumes.put(resumeName, new Resume());
                System.out.print("Please Enter your full name: ");
                resumes.get(resumeName).setName(kb.nextLine());
                System.out.print("Please Enter your email: ");
                resumes.get(resumeName).setEmail(kb.nextLine());
                //this while loop is for adding educations to the resume
                int eduCounter=0;
                while(!addEdu.equalsIgnoreCase("n")){
                    System.out.print("Would you like to add prior education(y/n): ");
                    addEdu = kb.nextLine();
                    //A new Education object is created an assigned to the resume
                    //it will be accessible by the counter variable
                    if(addEdu.equalsIgnoreCase("y")){
                        resumes.get(resumeName).addEducation(new Education());
                        System.out.print("Please enter your degree: ");
                        resumes.get(resumeName).getEducation(eduCounter).setDegreeType(kb.nextLine());
                        System.out.print("Please enter your major: ");
                        resumes.get(resumeName).getEducation(eduCounter).setMajor(kb.nextLine());
                        System.out.print("Please enter your university's name: ");
                        resumes.get(resumeName).getEducation(eduCounter).setUniName(kb.nextLine());
                        System.out.print("Please enter your graduation year: ");
                        resumes.get(resumeName).getEducation(eduCounter).setGradYear(kb.nextLine());
                        eduCounter++;
                    }
                }//end of education while
                //this while loop is for adding experience to the resume
                int expCounter=0;
                while(!addExp.equalsIgnoreCase("n")){
                    System.out.print("Would you like to add prior experience(y/n): ");
                    addExp = kb.nextLine();
                    //A new Education object is created an assigned to the resume
                    //it will be accessible by the counter variable
                    if(addExp.equalsIgnoreCase("y")){
                        resumes.get(resumeName).addExperiences(new Experience());
                        System.out.print("Please enter the company's name: ");
                        resumes.get(resumeName).getExperience(expCounter).setCompany(kb.nextLine());
                        System.out.print("Please enter your job title: ");
                        resumes.get(resumeName).getExperience(expCounter).setJobTitle(kb.nextLine());
                        System.out.print("Please enter your start date: ");
                        resumes.get(resumeName).getExperience(expCounter).setStartDate(kb.nextLine());
                        System.out.print("Please enter your end date(enter present if currently there): ");
                        resumes.get(resumeName).getExperience(expCounter).setEndDate(kb.nextLine());
                        expCounter++;
                    }
                }//end of experience while
                //this while loop is for adding skills
                int skillCounter=0;
                while(!addSkill.equalsIgnoreCase("n")){
                    System.out.print("Would you like to add prior skills(y/n): ");
                    addSkill = kb.nextLine();
                    //A new Education object is created an assigned to the resume
                    //it will be accessible by the counter variable
                    if(addSkill.equalsIgnoreCase("y")){
                        resumes.get(resumeName).addSkill(new Skill());
                        System.out.print("Please enter your skill: ");
                        resumes.get(resumeName).getSkill(skillCounter).setSkillName(kb.nextLine());
                        System.out.println("Please enter competency(Fundamental, Novice, Intermediate, Advanced, Expert: ");
                        resumes.get(resumeName).getSkill(skillCounter).setCompetency(kb.nextLine());
                        skillCounter++;
                    }
                }//end of experience while
            }//end of parent if
        }//end of parent while

        if(resumes.size()>0){
            int i=1;
            for (Resume resume : resumes.values()) {
                System.out.println("=================================================================================");
                System.out.print("Resume "+i++);
                System.out.println(resume.toString());
            }
        }

    }//end main
}
