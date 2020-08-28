package com.chaochaogu.design.principle.ocp;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class ComputerBook implements IComputerBook {
    private String name;
    private int price;
    private String author;
    private String scope;

    public ComputerBook(String name, int price, String author, String scope) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.scope = scope;
    }

    @Override
    public String getScope() {
        return scope;
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
