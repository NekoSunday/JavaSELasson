package com.sunday.loginCase.Filter;

import com.sunday.loginCase.Database.SearchWord;
import com.sunday.loginCase.utils.BlockUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

@WebFilter("/*")
public class articleFilter implements Filter {

    private SearchWord searchWord=new SearchWord();
    private List<String> wordList=new ArrayList<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        wordList=searchWord.getAllWord();
        System.out.println(wordList);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ServletRequest requestProxy = (ServletRequest) Proxy.newProxyInstance(
                articleFilter.class.getClassLoader(),
                servletRequest.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String methodName = method.getName();
                        if (methodName.equals("getParameter")) {
                            String returnVal = (String) method.invoke(servletRequest, args);
                            for (String word : wordList) {
                                if (returnVal.contains(word)){
                                   returnVal= returnVal.replaceAll(word, BlockUtils.wordBlock(word));
                                }
                            }
                            return returnVal;
                        }
                        return method.invoke(servletRequest,args);
                    }
                }
        );
        filterChain.doFilter(requestProxy,servletResponse);
    }

    @Override
    public void destroy() {

    }


}
