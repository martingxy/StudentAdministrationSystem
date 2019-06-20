package com.studentadministration.controller;

import com.studentadministration.model.ClassBean;
import com.studentadministration.model.DBUtil;
import com.studentadministration.model.OptCourseBean;
import com.studentadministration.model.Permission;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ControllerConfig.class);
        ClassBean classBean = context.getBean("ClassBean",ClassBean.class);
        System.out.println("新建Bean对象:"+classBean);
        DBUtil dbUtil = context.getBean("DBUtil",DBUtil.class);
        System.out.println("新建Bean对象:"+dbUtil);
        OptCourseBean optcourseBean = context.getBean("OptCourseBean",OptCourseBean.class);
        System.out.println("新建Bean对象:"+optcourseBean);
        Permission perBean = context.getBean("Permission", Permission.class);
        System.out.println("新建Bean对象:"+perBean);

    }
}
