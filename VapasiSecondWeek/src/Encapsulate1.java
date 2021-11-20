class class1{

    private int a;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

public class Encapsulate1 {
    public static void main(String[] args) {
        class1 c1 = new class1();
        c1.setA(2);
        System.out.println(c1.getA());
    }

}
