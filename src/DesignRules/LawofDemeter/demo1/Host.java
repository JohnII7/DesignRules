package DesignRules.LawofDemeter.demo1;

/**
 * @author John117
 * @date 2022/05/24  13:07
 */
public class Host {


    public void weGame(John john) {
        System.out.println("借到账号了:" + john.getId());

        System.out.println("也借到密码了:" + john.getPassword());
    }


}
