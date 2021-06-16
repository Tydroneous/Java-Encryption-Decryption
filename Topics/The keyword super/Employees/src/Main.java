class Employee {

    // write fields
    protected String name;
    protected String email;
    protected int experience;

    // write constructor
    Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    // write getters

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }

}

class Developer extends Employee {

    // write fields
    protected String mainLanguage;
    protected String[] skills;

    // write constructor
    Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        String[] mySkills = new String[skills.length];
        System.arraycopy(skills, 0, mySkills, 0, skills.length);
        this.skills = mySkills;

    }

    // write getters

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        String[] mySkills = new String[skills.length];
        System.arraycopy(skills, 0, mySkills, 0, skills.length);
        return mySkills;
    }
}

class DataAnalyst extends Employee {

    // write fields
    protected boolean phd;
    protected String[] methods;

    // write constructor

    DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        String[] myMethods = new String[methods.length];
        System.arraycopy(methods, 0, myMethods, 0, methods.length);
        this.methods = myMethods;
    }


    // write getters

    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        String[] myMethods = new String[methods.length];
        System.arraycopy(methods, 0, myMethods, 0, methods.length);
        return myMethods;
    }
}