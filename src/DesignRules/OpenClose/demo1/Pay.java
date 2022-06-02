package DesignRules.OpenClose.demo1;

public class Pay {
    public void pay(PayType payType) {
        if (payType.type.equals("ali")) {
            UseAliPay();
        }
        if (payType.type.equals("wechat")) {
            UseWeChatPay();
        }

    }

    public void UseWeChatPay() {
        System.out.println("使用微信支付");
    }

    public void UseAliPay() {
        System.out.println("使用支付宝支付");
    }
}
