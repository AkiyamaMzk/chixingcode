package chixing.day1210.day04;

import org.w3c.dom.ls.LSOutput;

public class Person {
    private int personAge;
    private boolean personSex;
    private boolean personMarried;
    private String personName;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public static boolean marryAge(Person p){
        if(p.personSex) return p.getPersonAge()>=24;
        else return p.getPersonAge()>=22;
    }

    public boolean marryAge(){
        if(this.personSex) return this.getPersonAge()>=24;
        else return this.getPersonAge()>=22;
    }

    public static boolean marry(Person p1,Person p2){
        return marryAge(p1)&&marryAge(p2)
                &&(p1.personSex!= p2.personSex)
                &&!p1.isPersonMarried()&&!p2.isPersonMarried();
    }

    public boolean marry(Person other){
        if(this==other||other==null) return false;
        if(!marryAge(this)||!other.marryAge()) return false;
        if(this.personSex==other.personSex) return false;
        if(this.personMarried||other.personMarried) return false;
        return true;
    }

    public String  getPersonSex() {
        if(this.personSex) return "M";
        else return "F";


    }

    public void setPersonSex(String personSexs) {
        this.personSex=personSexs.equals("男")? true:false;
    }

    public boolean isPersonMarried() {
        return personMarried;
    }

    public void setPersonMarried(boolean personMarried) {
        this.personMarried = personMarried;
    }




}
