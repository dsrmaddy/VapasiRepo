public class ScienceStudent extends Student{
    int physicsMarks;
    int chemMarks;
    int mathMarks;

    void printPhysicsMarks(int m) {
        this.physicsMarks = m;
        System.out.println(m);
    }
    void printChemMarks(int m) {
        this.chemMarks = m;
        System.out.println(m);
    }
    void printMathMarks(int m) {
        this.mathMarks = m;
        System.out.println(m);
    }
}
