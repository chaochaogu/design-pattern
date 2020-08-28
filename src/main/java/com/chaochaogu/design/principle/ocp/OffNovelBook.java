package com.chaochaogu.design.principle.ocp;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class OffNovelBook extends NovelBook {
    OffNovelBook(String name, int price, String author) {
        super(name, price, author);
    }

    @Override
    public int getPrice() {
        int price = super.getPrice();
        if (price > 4000) {
            price = price * 90 / 100;
        } else {
            price = price * 80 / 100;
        }
        return price;
    }
}
