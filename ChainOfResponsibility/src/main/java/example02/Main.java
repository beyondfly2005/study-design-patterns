package example02;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: example02.Main
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/9 15:34
 */
public class Main {


    //创建责任链
    public static void main(String[] args) {
        ForceAuthenticationFailureHandler forceAuthenticationFailureHandler = new ForceAuthenticationFailureHandler(null);
        AuthenticateUserHandler authenticateUserHandler = new AuthenticateUserHandler(forceAuthenticationFailureHandler);
        UserCachedHandler userCachedHandler = new UserCachedHandler(authenticateUserHandler);
        UsernameBannedHandler usernameBannedHandler = new UsernameBannedHandler(userCachedHandler);
        UserAuthenticationRequest banned = new UserAuthenticationRequest("bannedUser", "password");
        UserAuthenticationRequest cached = new UserAuthenticationRequest("cachedUser", "password");
        UserAuthenticationRequest authenticated = new UserAuthenticationRequest("authenticatedUser", "password");
        UserAuthenticationRequest failure = new UserAuthenticationRequest("authenticateFailure", "password");
        UserAuthenticationResult bannedResult = usernameBannedHandler.handleUserCredentials(banned);
        UserAuthenticationResult cachedResult = usernameBannedHandler.handleUserCredentials(cached);
        UserAuthenticationResult authenticatedResult = usernameBannedHandler.handleUserCredentials(authenticated);
        UserAuthenticationResult failureResult = usernameBannedHandler.handleUserCredentials(failure);
        System.out.println(bannedResult.toString());
        System.out.println();
        System.out.println(cachedResult.toString());
        System.out.println();
        System.out.println(authenticatedResult.toString());
        System.out.println();
        System.out.println(failureResult.toString());
    }
}
