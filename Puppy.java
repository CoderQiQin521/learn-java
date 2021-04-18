// import java.io.*;

public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        System.out.println("小狗的名字是: " + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("小狗的年龄为: " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy mPuppy = new Puppy("狗狗");
        mPuppy.setAge(2);
        mPuppy.getAge();
        System.out.println(mPuppy.puppyAge);
    }
}
