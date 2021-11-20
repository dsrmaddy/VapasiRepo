public class CommerceStudent extends Student{
    int accountMarks;
    int economicsMarks;
    int bizStudiesMarks;

    void printAccountMarks(int m) {
        this.accountMarks = m;
        System.out.println(m);
    }

    void printEconomicsMarks(int m) {
        economicsMarks = m;
        System.out.println(m);
    }

    void printBizStudiesMarks(int m) {
        bizStudiesMarks = m;
        System.out.println(m);
    }
}
