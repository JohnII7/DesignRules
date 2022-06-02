package DesignRules.OpenClose.demo2;

/**
 * @author John117
 * @date 2022/05/22  2:21
 */
public class Test {
    public static void main(String[] args) {
        new Pay().pay(new AliPay());
        new Pay().pay(new WechatPay());
    }
}
