package com.adc.tableau.tableauSever.util.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * 获取Bean的工具类
 *
 * @author lixuetao
 * date 2018-08-28
 **/
@Component
public class SpringContextHolder implements ApplicationContextAware {

    /**
     * 日志记录
     */
    private static Logger logger = LoggerFactory.getLogger(SpringContextHolder.class);

    /**
     * Bean工厂
     */
    @Autowired
    private static ApplicationContext context;

    /**
     * 根据类获取Bean
     *
     * @param clazz 类
     * @return T 类对象
     * @author lixuetao
     * date 2018-08-29
     **/
    public static <T> T getBean(Class<T> clazz) {
        try {
            return getApplicationContext().getBean(clazz);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据名称获取Bean
     *
     * @param name 名称
     * @return T 类对象
     * @author lixuetao
     * date 2018-08-29
     **/
    public static <T> T getBean(String name) {
        return (T) getApplicationContext().getBean(name);
    }

    /**
     * 获取Bean工厂
     *
     * @return org.springframework.context.ApplicationContext Bean工厂
     * @author lixuetao
     * date 2018-08-29
     **/
    public static ApplicationContext getApplicationContext() {
        return context;
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        context = applicationContext;
    }
}
