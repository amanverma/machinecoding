package designPatterns.MVCPattern;

public class Driver {
    public static void main(String[] args) {
        Student student = retrieveStudentFromDB();
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student,studentView);
        studentController.updateView();
        studentController.setStudentName("Preeti Sharma");
        studentController.updateView();
    }

    private static Student retrieveStudentFromDB() {
        Student student = new Student();
        student.setName("Aman Verma");
        student.setRollNo("664066");
        return student;
    }
}
