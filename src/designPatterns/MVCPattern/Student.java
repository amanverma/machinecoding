package designPatterns.MVCPattern;

public class Student {
    String name;
    String rollNo;

    public void setName(String name){
        this.name = name;
    }
    public void setRollNo(String rollNo){
        this.rollNo = rollNo;
    }
    public String getName(){
        return this.name;
    }
    public String getRollNo(){
        return this.rollNo;
    }

}
