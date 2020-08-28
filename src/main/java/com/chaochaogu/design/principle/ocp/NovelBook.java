package com.chaochaogu.design.principle.ocp;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class NovelBook implements IBook {
    private String name;
    private int price;
    private String author;

    NovelBook(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getAuthor() {
        return author;
    }
}
