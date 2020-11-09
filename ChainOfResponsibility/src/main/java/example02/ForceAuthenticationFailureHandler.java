package example02;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example02.ForceAuthenticationFailureHandler
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 15:37
 */
public class ForceAuthenticationFailureHandler extends UserAuthenticationHandler {

    public ForceAuthenticationFailureHandler(UserAuthenticationHandler next) {
        super(next);
    }

    @Override
    public UserAuthenticationResult handleUserCredentials(UserAuthenticationRequest request)
    {
        return getAuthenticationFailureResult(request);
    }

    private UserAuthenticationResult getAuthenticationFailureResult(UserAuthenticationRequest request)
    {
        UserAuthenticationResult result = new UserAuthenticationResult();
        result.setUsername(request.getUsername());
        result.setAuthenticated(false);

        return result;
    }
}