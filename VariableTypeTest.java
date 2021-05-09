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
        // byte c = 5;
        // c = (byte) (c + 2); //
        // c += 4; // 9 short
        // System.out.println(c);

        // int n = 10;
        // n += (n++) + (++n);
        // int n1 = 12;
        // int n2 = 30;
        // int n3 = -43;
        // int max1 = n1 > n2 ? n1 : n2;
        // int max2 = max1 > n3 ? max1 : n3;
        // System.out.println(max2);

        boolean x = true;
        boolean y = false;
        short z = 40;
        if ((z++ == 40) && (y = true)) {
            // true true
            z++; // 41
            // 42
        }

        if ((x = false) || (++z == 43)) {
            // false true
            z++;
            // 44
        }

        System.out.println("z = " + z);

        double d1 = 12.3;
        double d2 = 32.1;
        if (d1 > 10.0 && d2 < 20.0) {
            System.out.println(d1 + d2);
        } else {
            System.out.println(d1 * d2);
        }
    }
}
