package DesignRules.LiskovSubstitution.demo1;

/**
 * @author John117
 * @date 2022/05/22  12:12
 */
public class Penguin extends Bird {
    @Override
    public void setFlySpeed(double speed) {
        this.flySpeed = 0;
    }
}
