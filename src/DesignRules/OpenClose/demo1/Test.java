package DesignRules.OpenClose.demo1;

public class Test {
    public static void main(String[] args) {
        new Pay().pay(new AliPay());
        new Pay().pay(new WechatPay());
    }
}
