package DesignRules.CompositeReuse.demo2;

/**
 * @author John117
 * @date 2022/05/24  12:37
 */
public class Test {
    public static void main(String[] args) {
        new Foot().goOutByAdidas(new Adidas());
        new Foot().goOutByNike(new Nike());
    }
}
