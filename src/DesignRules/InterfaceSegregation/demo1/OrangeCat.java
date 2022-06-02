package DesignRules.InterfaceSegregation.demo1;

/**
 * 接口隔离原则
 * @author John117
 * @date 2022/05/23  18:28
 */
public class OrangeCat implements Cat{

    @Override
    public String getName() {
        return "我是大橘";
    }

    @Override
    public String getMiao() {
        return "我会喵喵叫";
    }

    @Override
    public String eatMouse() {
        return "是的，我能捕老鼠";
    }
}
