public class Variable {
    static int allClicks = 0;
    static int aa = 3131;

    String str = "hello world";

    public void pupAge() {
        int age = 2;
        age = age + 8;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args) {
        System.out.println(allClicks);
        Variable va = new Variable();
        System.out.println(va.str);
        va.pupAge();
        System.out.println(Variable.aa);
    }
}
