public class VariableTypeTest {
    /*
     * 基本数据类型 数值 整形byte short int long 浮点型: float double 字符串 char 布尔值 boolean
     */

    /*
     * 引用数据类型 类 classs 接口 interface 数组 []array
     */

    // 自动类型提升
    public static void main(String[] args) {
        // float f1 = 123.32F;
        // double d1 = 12312312.12312312321;
        // char c1 = '你';
        // System.out.println(c1);
        byte c = 5;
        c = (byte) (c + 2); //
        c += 4; // 9 short
        System.out.println(c);

        int n = 10;
        n += (n++) + (++n);
        System.out.println(n);
    }
}
