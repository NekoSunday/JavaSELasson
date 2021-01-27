package com.sunday.CookiePratice.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class cookieUtils {

    public static String getCookieValue(HttpServletRequest request,String name){

        Cookie[] cookies = request.getCookies();

        if (cookies!=null){
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(name)){
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
}
