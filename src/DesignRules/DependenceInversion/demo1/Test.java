package DesignRules.DependenceInversion.demo1;

/**
 * @author John117
 * @date 2022/05/23  17:35
 */
public class Test {
    public static void main(String[] args) {
        new John().getMessage(new WeChat());
    }
}
