import java.util.Scanner;

class ScrTest {
    // 质数 又叫素数 只能被1和它本身整除的自然数
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean b = true;
            for (int j = 2; j <= Math.sqrt(i); j++) { // 被除数
                if (i % j == 0) { // 非质数 退出循环
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println(i);
            }
            // b = true;
        }
    }
}
// class ScrTest {
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);

// System.out.println("请输入您的成绩: ");
// int score = scan.nextInt();

// if (score == 100) {
// System.out.println("奖励一辆BMW");
// } else if (score > 80 && score <= 99) {

// System.out.println("奖励一个iphone");
// } else if (score >= 60 && score <= 80) {
// System.out.println("奖励ipad");
// } else {
// System.out.println("无");
// }
// }
// }