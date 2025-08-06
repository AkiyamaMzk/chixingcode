package chixing.day1210.day04;

/**
 * 招聘网站中的公司
 * class 类:在招聘网站中公司共有的属性(字段field),方法(method)
 */



public class Company {
    private int companyId;
    private String companyName;
    private String companyType;
    private String companyAddress;
    private String companyEmpCount;


    public void setCompanyId(int companyId){
        this.companyId=companyId;
    }

    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }

    public void setCompanyType (String companyType){
        this.companyType=companyType;
    }

    public void setCompanyAddress(String companyAddress){
        this.companyAddress=companyAddress;
    }

    public void setCompanyEmpCount(String companyEmpCount){
        this.companyEmpCount=companyEmpCount;
    }

    public int getCompanyId(){
        return this.companyId;
    }
    public String getCompanyName(){
        return this.companyName;
    }
    public String getCompanyType(){
        return this.companyType;
    }
    public String getCompanyAddress(){
        return this.companyAddress;
    }
    public String getCompanyEmpCount(){
        return this.companyEmpCount;
    }


}
