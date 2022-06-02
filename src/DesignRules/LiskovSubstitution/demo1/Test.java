package DesignRules.LiskovSubstitution.demo1;

/**
 * @author John117
 * @date 2022/05/22  12:13
 */
public class Test {
    public static void main(String[] args) {
        Bird swallow = new Swallow();
        Bird penguin = new Penguin();
        swallow.setFlySpeed(180);
        penguin.setFlySpeed(180);
        System.out.println("飞行距离为300公里");
        System.out.println("swallow将飞行 "+swallow.getFlyTime(300)+" 小时");
        System.out.println("penguin将飞行 "+penguin.getFlyTime(300)+" 小时");
    }
}
