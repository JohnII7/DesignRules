package DesignRules.LawofDemeter.demo2;

/**
 * @author John117
 * @date 2022/05/24  13:28
 */
public class Test {

    static John john = new John();

    public static void main(String[] args) {
        // 在外面就将 id 和 password 拿到
        new Host().weGame(john.getId(), john.getPassword());

    }
}
