package com.chaochaogu.design.principle.ocp;

import com.google.common.collect.Lists;

import java.text.NumberFormat;
import java.util.List;

/**
 * 开闭原则（Open Close Principle）
 *
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class BookStore {
    private static final List<IBook> BOOK_LIST = Lists.newArrayList();

    // static静态模块初始化数据，实际项目中一般是由持久层完成
    static {
        BOOK_LIST.add(new OffNovelBook("天龙八部", 3200, "金庸"));
        BOOK_LIST.add(new OffNovelBook("巴黎圣母院", 5600, "雨果"));
        BOOK_LIST.add(new OffNovelBook("悲惨世界", 3500, "雨果"));
        BOOK_LIST.add(new OffNovelBook("金瓶梅", 4300, "兰陵笑笑生"));
        // 增加计算机书籍
        BOOK_LIST.add(new ComputerBook("Think in Java", 5000, "Bruce Eckel", "编程"));
    }

    /**
     * 模拟书店买书
     *
     * @param args
     */
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        numberFormat.setMaximumFractionDigits(2);
        System.out.println("-----------书店卖出去的书籍记录如下：-----------");
        for (IBook book : BOOK_LIST) {
            System.out.println("书籍名称：" + book.getName() + "\t书籍作者：" +
                    book.getAuthor() + "\t书籍价格：" + numberFormat.format(book.getPrice() /
                    100.0) + "元");
        }
    }
}
