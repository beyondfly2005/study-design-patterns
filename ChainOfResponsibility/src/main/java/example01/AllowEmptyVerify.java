package example01;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example01.AllowEmptyVerify
 * @Description: 非必填项校验
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 14:29
 */

public class AllowEmptyVerify extends RegularVerify {

    public AllowEmptyVerify(String data, String regular, String errorMsg) {
        super(data, regular, errorMsg);
    }

    @Override
    protected boolean allowEmpty() {
        return true;
    }
}
