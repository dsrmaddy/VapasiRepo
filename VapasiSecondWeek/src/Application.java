public class Application {
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println("no of Students so far : "+Student.noOfStudents);
        ScienceStudent scienceStudent = new ScienceStudent();
        scienceStudent.printPhysicsMarks(83);
        scienceStudent.printChemMarks(92);
        scienceStudent.printMathMarks(87);

        CommerceStudent comStudent = new CommerceStudent();
        comStudent.printAccountMarks(70);
        comStudent.printEconomicsMarks(85);
        comStudent.printBizStudiesMarks(92);

    }
}
