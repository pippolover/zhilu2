/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.alipay.basetech.test;

import java.lang.reflect.Field;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author midang
 * @version $Id: AbstractTestCase.java, v 0.1 2014年12月18日 下午2:20:17 midang Exp $
 */
public abstract class AbstractTestCase extends Assert {

    protected final Logger       logger = LoggerFactory.getLogger(getClass());

    protected ApplicationContext context;

    public AbstractTestCase() {
        System.setProperty("spring.profiles.active", "dev");
        initContext();
        injectDependencies();
    }

    /**
     * 
     * @return
     */
    protected abstract String[] getClassPathXmlLocations();

    protected void injectDependencies() {
        Field[] fields = getClass().getDeclaredFields();
        for (Field field : fields) {
            Autowired autowired = field.getAnnotation(Autowired.class);
            if (autowired != null) {
                Object bean = context.getBean(field.getType());
                field.setAccessible(true);
                try {
                    field.set(this, bean);
                } catch (IllegalArgumentException e) {
                    logger.error("", e);
                } catch (IllegalAccessException e) {
                    logger.error("", e);
                }
            }
        }
    }

    protected void initContext() {
        context = new ClassPathXmlApplicationContext(getClassPathXmlLocations());
    }

}
