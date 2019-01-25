package digit;


import java.util.Scanner;

public class huangHe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入地名：");
        String location = s.nextLine();
        System.out.println("请输入公司类型");
        String companyType = s.nextLine();
        System.out.println("请输入公司名称");
        String companyName = s.nextLine();
        System.out.println("清驶入老板名称");
        String bossName = s.nextLine();
        System.out.println("请输入金额");
        String Money = s.nextLine();
        System.out.println("请输入产品");
        String production = s.nextLine();
        System.out.println("请输入单位");
        String unit = s.nextLine();


        String sentenceFormat = "%s最大的%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下%s个亿；，没办法，拿%s抵工资!%n原价一%s多，两%s多的代码，现在只卖20块。%s王八蛋，还我血汗钱";
        System.out.printf(sentenceFormat,location,companyType,companyName,bossName,Money,production,unit,unit,bossName);
    }
}
