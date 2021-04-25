package com.doodl6.springboot.web.listener;

import com.doodl6.springboot.web.constant.WebConstants;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.File;

/**
 * 初始化数据监听
 * Created by daixiaoming on 2018/5/5.
 */
@WebListener
public class InitDataListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        WebConstants.ROOT_PATH = servletContext.getRealPath(File.separator);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
