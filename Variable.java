// 先声明再调用
// 作用域在{}内
// 同一个作用域内,不能定义重名的变量
public class Variable {
    static int allClicks = 0;
    static int id = 3131;

    String str = "hello world";

    public void pupAge() {
        int age = 2;
        age = age + 8;
        System.out.println("年龄是: " + age);
    }

    public static void main(String[] args) {

        byte a2 = 13;
        byte a3 = 67;

        String str = "hello world";

        boolean flag = true;
        int r1 = a2 * a3;
        int r2 = 'a' + 1; // 98
        System.out.println(flag);

        // byte short int long float double char string boolean

        // System.out.println(allClicks);
        // Variable va = new Variable();
        // System.out.println(va.str);
        // va.pupAge();
        // System.out.println(Variable.aa);
    }
}
