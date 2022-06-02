package DesignRules.InterfaceSegregation.demo2;

/**
 * @author John117
 * @date 2022/05/23  18:33
 */
public class Tiger implements BigCat{
    @Override
    public String getName() {
        return "我是虎哥";
    }

    @Override
    public Boolean isLiveWild() {
        return true;
    }
}
