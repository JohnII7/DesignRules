package DesignRules.OpenClose.demo2;

/**
 * @author John117
 * @date 2022/05/22  2:17
 */
public class AliPay extends PayType {
    public AliPay() {
        super.type = "ali";
    }

    @Override
    public void pay() {
        System.out.println("使用支付宝支付");
    }
}
