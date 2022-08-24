package designPatterns.MVCPattern;

public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: \n");
        System.out.println("Name: "+ studentName+"\n");
        System.out.println("Roll No.: "+studentRollNo);
    }
}
