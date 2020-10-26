package com.chaochaogu.design.mix.command.responsibility.chain;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * 根据父类获得子类，谨慎使用，在核心的应用中尽量不要使用该工具，会严重影响性能
 *
 * @author chaochao Gu
 * @date 2020/10/24
 */
public class ClassUtils {

    /**
     * 根据父类查找到所有的子类，默认情况是子类和父类都在同一个包名下
     *
     * @param fatherClass
     * @return
     */
    public static List<Class> getSonClass(Class fatherClass) {
        //定义一个返回值
        List<Class> returnClassList = new ArrayList<Class>();
        //获得包名称
        String packageName = fatherClass.getPackage().getName();
        //获得包中的所有类
        List<Class> packClasses = getClasses(packageName);
        //判断是否是子类
        for (Class c : packClasses) {
            if (fatherClass.isAssignableFrom(c) && !fatherClass.equals(c)) {
                returnClassList.add(c);
            }
        }
        return returnClassList;
    }

    /**
     * 从一个包中查找出所有的类，在jar包中不能查找
     *
     * @param packageName
     * @return
     */
    private static List<Class> getClasses(String packageName) {
        ClassLoader classLoader = Thread.currentThread()
                .getContextClassLoader();
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = null;
        try {
            resources = classLoader.getResources(path);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        List<File> dirs = new ArrayList<File>();
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList<Class> classes = new ArrayList<Class>();
        for (File directory : dirs) {
            classes.addAll(findClasses(directory, packageName));
        }
        return classes;
    }

    private static List<Class> findClasses(File directory, String packageName) {
        List<Class> classes = new ArrayList<Class>();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                try {
                    classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return classes;
    }
}