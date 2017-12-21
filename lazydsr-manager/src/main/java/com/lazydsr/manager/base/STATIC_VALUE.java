package com.lazydsr.manager.base;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * STATIC_VALUE
 * PROJECT_NAME: lazy-web
 * PACKAGE_NAME: com.lazy.lazyweb.base
 * Created by Lazy on 2017/10/11 22:44
 * Version: 0.1
 * Info: @TODO:...
 */
public class STATIC_VALUE {
    private static InetAddress address = null;
    public static String SERVER_NAME = "";
    public static String SERVER_IP = "";
    public static String VIEW_ERROR="";
    public static String VIEW_400="";
    public static String VIEW_404="";
    public static String VIEW_500="";

    public static String TRUE="0";
    public static String FALSE="1";

    public static void init() throws UnknownHostException {
        address = InetAddress.getLocalHost();
        SERVER_NAME = address.getHostAddress();
        SERVER_IP = address.getHostAddress();
        VIEW_400="/basic/404";
        VIEW_404="/basic/404";
        VIEW_500="/basic/500";
    }


}
