package DesignRules.OpenClose.demo2;

/**
 * @author John117
 * @date 2022/05/22  2:18
 */
public class WechatPay extends PayType {
    public WechatPay() {
        super.type = "wechat";
    }

    @Override
    public void pay() {
        System.out.println("使用微信支付");
    }
}
