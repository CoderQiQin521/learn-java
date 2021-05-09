import java.util.Scanner;

class ScrTest {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int b = i / 100;
            int s = i % 100 / 10;
            int g = i % 100 % 10;
            if (b * b * b + s * s * s + g * g * g == i) {
                System.out.println("水仙花数: " + i);

            }
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