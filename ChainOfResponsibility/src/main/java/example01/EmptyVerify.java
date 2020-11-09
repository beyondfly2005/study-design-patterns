package example01;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example01.EmptyVerify
 * @Description: 空数据校验
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 14:16
 */
public class EmptyVerify extends AbsVerify {

    public EmptyVerify(String data, String errorMsg) {
        super(data, errorMsg);
    }

    @Override
    public boolean doVerify() {
        return isEmpty(data) ? showErrorMsg(errorMsg) : doNextFilter();
    }
}
