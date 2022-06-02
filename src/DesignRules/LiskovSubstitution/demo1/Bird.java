package DesignRules.LiskovSubstitution.demo1;

/**
 * @author John117
 * @date 2022/05/22  12:09
 */
public class Bird {
    double flySpeed;

    public void setFlySpeed(double speed) {
        this.flySpeed = speed;
    }

    public double getFlyTime(double distance){
        return distance/flySpeed;
    }
}
