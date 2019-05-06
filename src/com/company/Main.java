package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<String, Resume> resumes = new HashMap<>();//this will keep track of the resumes created

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer="y";
        String resumeName="";//this will keep track of the new created resume by it name
        String addEdu, addExp, addSkill;
        while(!answer.equalsIgnoreCase("n")){
            System.out.print("Would you like to create a resume?(y/n): ");
            answer = input.nextLine();
            if(answer.equalsIgnoreCase("y")) {
                addEdu = "y";
                addExp="y";
                addSkill="y";
                System.out.print("Please enter the name of your resume: ");
                resumeName = input.nextLine();
                resumes.put(resumeName, new Resume());
                System.out.print("Please Enter your full name: ");
                resumes.get(resumeName).setName(input.nextLine());
                System.out.print("Please Enter your email: ");
                resumes.get(resumeName).setEmail(input.nextLine());
                System.out.print("Enter phone number(xxx-xxx-xxxx): ");
                resumes.get(resumeName).setPhone(input.nextLine());
                //this while loop is for adding educations to the resume
                int eduCounter=0;//this will allow for the program to get access to the recently created
                //and current Education Object
                System.out.print("Would you like to add education?(y/n): ");
                while(!addEdu.equalsIgnoreCase("n")){
                    if(eduCounter>0){
                        System.out.print("Would you like to add additional education?(y/n): ");
                    }
                    addEdu = input.nextLine();
                    //A new Education object is created an assigned to the resume
                    //it will be accessible by the counter variable
                    if(addEdu.equalsIgnoreCase("y")){
                        resumes.get(resumeName).addEducation(new Education());
                        System.out.print("Please enter your degree: ");
                        resumes.get(resumeName).getEducation(eduCounter).setDegreeType(input.nextLine());
                        System.out.print("Please enter your major: ");
                        resumes.get(resumeName).getEducation(eduCounter).setMajor(input.nextLine());
                        System.out.print("Please enter your university's name: ");
                        resumes.get(resumeName).getEducation(eduCounter).setUniName(input.nextLine());
                        System.out.print("Please enter your graduation year: ");
                        resumes.get(resumeName).getEducation(eduCounter).setGradYear(input.nextLine());
                        eduCounter++;
                    }
                }//end of education while
                //this while loop is for adding experience to the resume
                int expCounter=0;//this will allow for the program to get access to the recently created
                System.out.print("Would you like to add prior experience?(y/n): ");
                //and current Experience Object
                while(!addExp.equalsIgnoreCase("n")){
                    if(expCounter>0){
                        System.out.print("Would you like to add additional prior experience?(y/n): ");
                    }
                    addExp = input.nextLine();
                    //A new Education object is created an assigned to the resume
                    //it will be accessible by the counter variable
                    if(addExp.equalsIgnoreCase("y")){
                        resumes.get(resumeName).addExperiences(new Experience());
                        System.out.print("Please enter the company's name: ");
                        resumes.get(resumeName).getExperience(expCounter).setCompany(input.nextLine());
                        System.out.print("Please enter your job title: ");
                        resumes.get(resumeName).getExperience(expCounter).setJobTitle(input.nextLine());
                        System.out.print("Please enter your start date(mm/yyyy): ");
                        resumes.get(resumeName).getExperience(expCounter).setStartDate(input.nextLine());
                        System.out.print("Please enter your end date(enter present if currently there)(mm/yyyy): ");
                        resumes.get(resumeName).getExperience(expCounter).setEndDate(input.nextLine());
                        System.out.println("Please enter a brief description for this job: ");
                        resumes.get(resumeName).getExperience(expCounter).addDescription(input.nextLine());
                        expCounter++;
                    }
                }//end of experience while
                //this while loop is for adding skills
                int skillCounter=0;
                System.out.print("Would you like to add prior skills(y/n)?: ");
                while(!addSkill.equalsIgnoreCase("n")){
                    if(skillCounter>0){
                        System.out.print("Would you like to add additional prior skills(y/n)?: ");
                    }
                    addSkill = input.nextLine();
                    //A new Education object is created an assigned to the resume
                    //it will be accessible by the counter variable
                    if(addSkill.equalsIgnoreCase("y")){
                        resumes.get(resumeName).addSkill(new Skill());
                        System.out.print("Please enter your skill: ");
                        resumes.get(resumeName).getSkill(skillCounter).setSkillName(input.nextLine());
                        System.out.print("Please enter competency(Fundamental, Novice, Intermediate, Advanced, Expert: ");
                        resumes.get(resumeName).getSkill(skillCounter).setCompetency(input.nextLine());
                        skillCounter++;
                    }
                }//end of experience while
            }else if(!resumes.isEmpty()){
                System.out.println("Would you like to edit any recently created resume(y/n)? ");
                answer = input.nextLine();
                if(answer.equalsIgnoreCase("y")){
                    while(!resumeName.equalsIgnoreCase("q")) {
                        System.out.print("Please enter the resume's name(q-quit): ");
                        resumeName = input.nextLine();
                        if (resumes.containsKey(resumeName)) {
                            System.out.print("What would you like to edit?(name, email, or phone)");
                            resumes.get(resumeName).changeInfo(input.nextLine());
                        } else {
                            System.out.println("No resume found with that name, please check name and try again");
                        }
                    }//end-while
                }//end-if
            }//end of parent if
        }//end of parent while

        if(!resumes.isEmpty()){
//            int i=1;
//            for (Resume resume : resumes.values()) {
//                System.out.println("=================================================================================");
//                System.out.printf("Resume %d\n",i++);
//                System.out.println(resume.toString());
//            }
            Recruiter recruiter = new Recruiter();
            System.out.print("Please Enter a skill word to search for: ");
            recruiter.searchBySkill(input.nextLine(), resumes);
            System.out.println("=================================================================================");
            System.out.println(recruiter.getFoundResumeList());
        }else{
            System.out.println("=================================================================================");
            System.out.println("No resumes to show");
        }

    }//end main
}
