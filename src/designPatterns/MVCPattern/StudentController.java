package designPatterns.MVCPattern;

public class StudentController {
    Student student;
    StudentView studentView;
    StudentController(Student student, StudentView studentView){
        this.student = student;
        this.studentView = studentView;
    }
    public void setStudentName(String name){
        student.setName(name);
    }
    public void setStudentRollNo(String rollNo){
        student.setRollNo(rollNo);
    }
    public String getStudentName(){
        return student.getName();
    }
    public String getStudentRollNo(){
        return student.getRollNo();
    }
    public void updateView(){
        studentView.printStudentDetails(student.getName(), student.getRollNo());
    }
}
