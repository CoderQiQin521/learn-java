interface Ipeople {
    public void eat();

}

public class Person implements Ipeople {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Ipeople xiaoming = new Person("小明");
        xiaoming.eat();
    }

    public void eat() {
        System.out.println(this.name + "在吃东西");
    }
}

// 两个类 实现 接口,各自的逻辑不一样
class People implements Ipeople {
    public static void main(String[] args) {
        int myAge = 20;

        Ipeople zhangsan = new People();
        zhangsan.eat();
        System.out.println(myAge);
    }

    public void eat() {
        System.out.println("张三吃饭中");
    }
}