public class EmployeeTest {
    /**
     * @author ���� ASDASDA
     */
    public static void main(String[] args) {
        // ʹ�ù�����������������
        Employee empOne = new Employee("����");
        Employee empTwo = new Employee("����");

        empOne.empAge(30);
        empOne.empDesignation("�߼�����Ա");
        empOne.empSalary(99999);
        empOne.printEmployee();

        empTwo.empAge(18);
        empTwo.empDesignation("ʵϰ��");
        empTwo.empSalary(1000);
        empTwo.printEmployee();
    }
}
