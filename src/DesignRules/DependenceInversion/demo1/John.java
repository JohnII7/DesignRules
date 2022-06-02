package DesignRules.DependenceInversion.demo1;

/**
 * @author John117
 * @date 2022/05/23  17:32
 */
public class John {
    public void getMessage(WeChat weChat){
        weChat.sendMessage();
    }
}
