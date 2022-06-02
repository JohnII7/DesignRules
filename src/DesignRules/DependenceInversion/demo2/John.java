package DesignRules.DependenceInversion.demo2;

/**
 * @author John117
 * @date 2022/05/23  17:37
 */
public class John {
    public void getMessage(IMessage message){
        message.sendMessage();
    }
}
