package example01;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example01.Verify
 * @Description: 利用责任链模式构建数据校验模块
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 14:11
 */

public interface Verify {
    //校验
    boolean doVerify();

    //设置下个校验器
    void setNextVerify(Verify verify);

    //显示错误信息
    boolean showErrorMsg(String errorMsg);

    //执行校验回调（提供支持，项目未使用到）
    interface VerifyCallBack {
        //成功
        void sussecc();

        //失败
        void failure();
    }
}
