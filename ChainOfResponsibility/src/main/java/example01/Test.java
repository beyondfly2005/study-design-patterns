package example01;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example01.Test
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 14:33
 */
public class Test {

    static String name = "童心未泯佐为";
    static String password = "qqwwee123";
    static String phone = "";

    public static void main(String args[]) {

        boolean execute = new VerifyManger()
                .addVerify(new EmptyVerify(name, "请填写用户名"))
                .addVerify(new RegularVerify(name, Regular.NAME, "用户名格式不正确"))

                .addVerify(new EmptyVerify(password, "请填写密码"))
                .addVerify(new RegularVerify(password, Regular.PASSWORD, "密码格式不正确"))

                .addVerify(new AllowEmptyVerify(phone, Regular.PHONE, "手机号格式不正确"))//非必填 允许为空 有值校验
                .execute();
        if (execute) {
            System.out.println("校验通过");
        }
    }


}
