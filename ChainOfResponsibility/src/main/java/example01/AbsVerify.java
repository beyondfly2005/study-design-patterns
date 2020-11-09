package example01;

import org.apache.commons.lang.StringUtils;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example01.AbsVerify
 * @Description: 抽象校验器
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 14:15
 */

public abstract class AbsVerify implements Verify {

    protected String data;//校验数据
    protected String errorMsg;//失败信息

    protected Verify nextVerify;   //下个执行的校验器
    protected VerifyCallBack callBack;

    public AbsVerify(String data, String errorMsg) {
        this.data = data;
        this.errorMsg = errorMsg;
    }

    @Override
    public void setNextVerify(Verify verify) {
        this.nextVerify = verify;
    }

    @Override
    public boolean showErrorMsg(String errorMsg) {
        if (callBack != null) {
            callBack.failure();
        }
        if (!isEmpty(errorMsg)) {
            System.out.println(errorMsg);
        }
        return false;
    }

    //执行下一个校验
    protected boolean doNextFilter() {
        if (callBack != null) {
            callBack.sussecc();
        }
        return nextVerify != null ? nextVerify.doVerify() : true;
    }

    //是否为空
    protected boolean isEmpty(String msg) {
        //return StringUtil.isBlank(msg);
        return StringUtils.isBlank(msg);
    }

    public VerifyCallBack getCallBack() {
        return callBack;
    }

    public void setCallBack(VerifyCallBack callBack) {
        this.callBack = callBack;
    }
}
