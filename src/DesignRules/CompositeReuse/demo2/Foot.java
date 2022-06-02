package DesignRules.CompositeReuse.demo2;

/**
 * @author John117
 * @date 2022/05/24  12:33
 */
public class Foot {

    public void goOutByAdidas(Adidas adidas) {
        adidas.putOn();
    }

    public void goOutByNike(Nike nike) {
        nike.putOn();
    }
}
