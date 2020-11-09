package example01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example01.RegularVerify
 * @Description: 数据格式校验（使用正则表达式）
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 14:16
 */
public class RegularVerify extends AbsVerify {

    protected String regular;//正则表达式

    public RegularVerify(String data, String regular, String errorMsg) {
        super(data,errorMsg);
        this.regular = regular;
    }

    //是否允许为空
    protected boolean allowEmpty() {
        return false;
    }

    @Override
    public boolean doVerify() {
        if (isEmpty(data)) {
            return allowEmpty() ? doNextFilter() : showErrorMsg(errorMsg);
        }
        return matcher() ? doNextFilter() : showErrorMsg(errorMsg);
    }

    //正则表达式
    private boolean matcher() {
        Pattern p = Pattern.compile(regular);
        Matcher m = p.matcher(data);
        return m.matches();
    }
}