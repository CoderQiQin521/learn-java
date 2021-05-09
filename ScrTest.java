import java.util.Scanner;

class ScrTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入m: ");
        int m = scan.nextInt();
        System.out.println("请输入n: ");
        int n = scan.nextInt();

        // 最大公约数
        int min = (m > n) ? n : m;
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数: " + i);
                break;
            }
        }

        // 最小公倍数
        int max = m > n ? m : n;
        for (int i = max; i <= (m * n); i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("最小公倍数: " + i);
                break;
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