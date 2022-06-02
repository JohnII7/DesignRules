package DesignRules.LiskovSubstitution.demo2;

/**
 * @author John117
 * @date 2022/05/22  12:21
 */
public class Test {
    public static void main(String[] args) {
        Bird swallow = new Swallow();
        Animal penguin = new Penguin();
        swallow.setFlySpeed(120);
        penguin.setRunSpeed(20);
        System.out.println("如果移动300公里：");
        System.out.println("swallow将移动：" + swallow.getFlyTime(300) + "小时");
        System.out.println("penguin将移动：" + penguin.getRunTime(300) + "小时");
    }
}
