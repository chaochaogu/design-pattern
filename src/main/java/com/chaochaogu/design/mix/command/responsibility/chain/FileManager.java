package com.chaochaogu.design.mix.command.responsibility.chain;

/**
 * 文件管理类
 *
 * @author chaochao Gu
 * @date 2020/10/24
 */
public class FileManager {

    /**
     * ls命令
     *
     * @param path
     * @return
     */
    public static String ls(String path) {
        return "file1\nfile2\nfile3\nfile4";
    }

    /**
     * ls -l命令
     *
     * @param path
     * @return
     */
    public static String ls_l(String path) {
        String str = "drw-rw-rw root system 1024 2009-8-20 10:23 file1\n";
        str = str + "drw-rw-rw root system 1024 2009-8-20 10:23 file2\n";
        str = str + "drw-rw-rw root system 1024 2009-8-20 10:23 file3";
        return str;
    }

    /**
     * ls -a命令
     *
     * @param path
     * @return
     */
    public static String ls_a(String path) {
        String str = ".\n..\nfile1\nfile2\nfile3";
        return str;
    }

    /**
     * 默认的计算大小
     *
     * @return
     */
    public static String df() {
        return "/\t10485760\n/usr\t104857600\n/home\t1048576000\n";
    }

    /**
     * 按照kb来计算
     *
     * @return
     */
    public static String df_k() {
        return "/\t10240\n/usr\t102400\n/home\tt10240000\n";
    }

    /**
     * 按照gb计算
     *
     * @return
     */
    public static String df_g() {
        return "/\t10\n/usr\t100\n/home\tt10000\n";
    }
}
