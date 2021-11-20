public class MethodOverloadingLesson {

    public void doSomething(int val){
        System.out.println("this is an integer");
    }

    public void doSomething(String val){
        System.out.println("this is a string");
    }

    public static void main(String[] args) {
        MethodOverloadingLesson mol = new MethodOverloadingLesson();
        mol.doSomething(20);

    }
}


