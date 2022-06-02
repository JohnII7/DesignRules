package DesignRules.LiskovSubstitution.demo2;

/**
 * @author John117
 * @date 2022/05/22  12:18
 */
public class Bird extends Animal{
    double flySpeed;

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public double getFlyTime(double distance) {
        return distance/flySpeed;
    }
}
