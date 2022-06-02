package DesignRules.DependenceInversion.demo2;

/**
 * @author John117
 * @date 2022/05/23  17:37
 */
public class WeChat implements IMessage{
    @Override
    public void sendMessage() {
        System.out.println("微信：速度上号");
    }
}
