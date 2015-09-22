package com.alipay.basetech.app.test;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * 
 * @author midang
 * @version $Id: AppTest.java, v 0.1 2014年12月18日 下午4:16:20 midang Exp $
 */
public class AppTest {

    public static void main(String[] args) throws Exception {

        System.setProperty("spring.profiles.active", "dev");

        Server server = new Server(8000);
        WebAppContext context = new WebAppContext();
        context.setDescriptor("/WEB-INF/web.xml");
        context.setResourceBase("src/main/webapp");
        context.setContextPath("/");
        context.setParentLoaderPriority(true);
        server.setHandler(context);

        server.start();
        server.join();
    }
}
