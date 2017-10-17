package com.tekwill.inheritance;

public class Man extends Human {
    protected String kodyk;
    protected String [] responsibilities;

    public Man () {

    }

    public String[] getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String[] responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getKodyk() {
        return kodyk;
    }

    public void setKodyk(String kodyk) {
        this.kodyk = kodyk;
    }
    public void iWantEat (String food){
        System.out.println(" Kakoi fkusnyi " + food);
    }

}
