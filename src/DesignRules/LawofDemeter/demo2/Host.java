package DesignRules.LawofDemeter.demo2;

/**
 * @author John117
 * @date 2022/05/24  13:25
 */
public class Host {

    public void weGame(Integer id, String password) {
        System.out.println("借到账号了:" + id);

        System.out.println("也借到密码了:" + password);
    }
}
