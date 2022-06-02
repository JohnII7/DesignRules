package DesignRules.LiskovSubstitution.demo2;

/**
 * @author John117
 * @date 2022/05/22  12:17
 */
public class Animal {
    double runSpeed;

    public void setRunSpeed(double runSpeed) {
        this.runSpeed = runSpeed;
    }

    public double getRunTime(double distance) {
        return distance/runSpeed;
    }
}
