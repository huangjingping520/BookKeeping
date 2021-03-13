public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag = true;

        //用于记录用户收支详情
        String details = "";

        int balance = 10000;
        while(isFlag){
            System.out.println("----------BookKeeping-----------");
            System.out.println("          1. 收支明细            ");
            System.out.println("          2. 登记收入            ");
            System.out.println("          3. 登记支出            ");
            System.out.println("          4. 退   出            ");
            System.out.print("          请选择（1-4）：");

            //获取用户的选择
            char selection = Utility.readMenuSelection();

            switch (selection){
                case '1' :
                    //System.out.println("1. 收支明细");
                    System.out.println("--------------明细---------------");
                    System.out.println("收  支\t账户金额\t收支金额\t说   明\n");
                    System.out.println(details);
                    System.out.println("--------------------------------");
                    break;


                case '2' :
                    //System.out.println("2. 登记收入");
                    System.out.print("本次收入金额：");
                    int money = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String info = Utility.readString();

                    //balance
                    balance += money;

                    //details
                    details += ("收入\t\t" + balance + "\t" + money + "\t\t" + info + "\n");


                    System.out.println("------------登记完成-------------");
                    break;


                case '3' :
                    //System.out.println("3. 登记支出");
                    System.out.print("本次支出金额：");
                    int moneyOut = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String infoOut = Utility.readString();
                    System.out.println("------------登记完成-------------");

                    if(balance >= moneyOut){
                        balance -= moneyOut;
                        details += ("支出\t\t" + balance + "\t" + moneyOut + "\t\t" + infoOut + "\n");
                    }else{
                        System.out.println("已透支！");
                    }

                    break;


                case '4' :
                    // System.out.println("4. 退  出");
                    System.out.print("确认是否退出(Y/N):");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }
                    //  break;
            }
        }
    }
}
