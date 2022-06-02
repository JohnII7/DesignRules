package DesignRules.DependenceInversion.demo2;

/**
 * @author John117
 * @date 2022/05/23  17:39
 */
public class DingDing implements IMessage{
    @Override
    public void sendMessage() {
        System.out.println("钉钉：速度上号");
    }
}
