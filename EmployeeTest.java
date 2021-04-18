public class EmployeeTest {
    /**
     * @author 齐秦 ASDASDA
     */
    public static void main(String[] args) {
        // 使用构造器创建两个对象
        Employee empOne = new Employee("张三");
        Employee empTwo = new Employee("李四");

        empOne.empAge(30);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(99999);
        empOne.printEmployee();

        empTwo.empAge(18);
        empTwo.empDesignation("实习生");
        empTwo.empSalary(1000);
        empTwo.printEmployee();
    }
}
