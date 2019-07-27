package fourclasswork.school;

public class MainSchool {
    public static void main(String[] args) {

        Students ivo = new Students("Ivo", 11, 4);
        Teachers zlobila = new Teachers("Zlobila");

        zlobila.setStudentAvgGrade(3,ivo);
        System.out.println("Ivo's new average grade is: " + ivo.getAvgGrade());
    }
}
