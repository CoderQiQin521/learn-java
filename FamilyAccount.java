public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag = true;
        String detail = "类型\t余额\t\t明细\t\t备注\n";
        int blance = 10000;
        while (isFlag) {
            System.out.println("-----------------家庭财务记账软件-----------------");
            System.out.println("                 1.收支明细");
            System.out.println("                 2.登记收入");
            System.out.println("                 3.登记支出");
            System.out.println("                 4.退 出\n");
            System.out.print("                 请选择(1-4): ");
            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("收支明细");
                    System.out.println(detail);
                    break;
                case '2':
                    System.out.println("登记收入");
                    System.out.print("请输入金额: ");
                    int money = Utility.readNumber();
                    System.out.print("请输入备注: ");
                    String info = Utility.readString();
                    blance += money;
                    detail += "收入\t" + blance + "\t\t" + money + "\t\t" + info + "\n";
                    System.out.println("-----------------登记完成-----------------\n");
                    break;
                case '3':
                    System.out.println("登记支出");
                    System.out.print("请输入金额: ");
                    int money1 = Utility.readNumber();
                    System.out.print("请输入备注: ");
                    String info1 = Utility.readString();
                    if (blance >= money1) {
                        blance -= money1;
                        detail += "支出\t" + blance + "\t\t" + money1 + "\t\t" + info1 + "\n";
                    } else
                        System.out.println("支出超出账户余额,支付失败");
                    System.out.println("-----------------登记完成-----------------\n");
                    break;
                case '4':
                    System.out.println("确认是否退出(Y/N): ");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                    break;
            }
        }
    }

}
