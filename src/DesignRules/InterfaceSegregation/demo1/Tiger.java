package DesignRules.InterfaceSegregation.demo1;

/**
 * @author John117
 * @date 2022/05/23  18:30
 */
public class Tiger implements Cat{
    @Override
    public String getName() {
        return "我是虎哥";
    }

    @Override
    public String getMiao() {
        return null;
    }

    @Override
    public String eatMouse() {
        return null;
    }
}
