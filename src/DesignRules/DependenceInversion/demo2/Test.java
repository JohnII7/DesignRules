package DesignRules.DependenceInversion.demo2;

/**
 * @author John117
 * @date 2022/05/23  17:39
 */
public class Test {
    public static void main(String[] args) {
        new John().getMessage(new WeChat());
        new John().getMessage(new DingDing());
    }
}
