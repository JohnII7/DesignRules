package DesignRules.OpenClose.demo2;

/**
 * @author John117
 * @date 2022/05/22  2:20
 */
public class Pay {
    public void pay(PayType payType){
        payType.pay();
    }
}
