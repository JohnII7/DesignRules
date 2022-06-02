package DesignRules.LawofDemeter.demo1;

/**
 * @author John117
 * @date 2022/05/24  13:26
 */
public class Test {
    static John john = new John();

    public static void main(String[] args) {
        new Host().weGame(john);
    }

}
