package com.company;

public class Main {

    public static void main(String[] args) {
	    Resume myResume = new Resume("John J Jingleheirmer-Schmidt", "jjjschmidt@gmail.com");
	    Education edu1 = new Education("BS", "Psychology", "UMD", "2002");
	    Education edu2 = new Education("MS", "Software Engineering", "Johns Hopkins U", "2005");
	    Experience exp1 = new Experience("Amtrak","Software Developer II","June 2015",
                "Present", "The description of this job.");
	    Experience exp2 = new Experience("Amtrak","Software Developer 1", "June 2014",
                "June 2015", "Some description of this job.");
	    Skill java = new Skill("Java","Advanced");
        Skill php = new Skill("PHP","Intermediate");
        Skill ruby = new Skill("Ruby on Rails","Novice");

        myResume.addEducation(edu1);
        myResume.addEducation(edu2);
        myResume.addExperiences(exp1);
        myResume.addExperiences(exp2);
        myResume.addSkill(java);
        myResume.addSkill(php);
        myResume.addSkill(ruby);

        System.out.println(myResume.toString());
    }
}
