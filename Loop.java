public class Loop {
    public static void main(String[] args) {
        String[] names = { "张三", "李四" };
        for (String name : names) {
            System.out.println(name);
        }

        int[] nums = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            if (nums[i] >= 3) {
                continue;
            }
            // break 跳出整个循环
            // continue 跳出本次循环
        }

        int count = 0;
        while (count < nums.length) {

            System.out.println(nums[count]);
            count++;
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();
        }
    }
}
