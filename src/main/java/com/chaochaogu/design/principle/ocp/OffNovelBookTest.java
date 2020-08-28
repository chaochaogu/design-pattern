package com.chaochaogu.design.principle.ocp;

import junit.framework.TestCase;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class OffNovelBookTest extends TestCase {
    private IBook below40NovelBook = new OffNovelBook("平凡的世界",3000,"路遥");
    private IBook above40NovelBook = new OffNovelBook("平凡的世界",6000,"路遥");
    public void testPriceBelow40(){
        assertEquals(2400, below40NovelBook.getPrice());
    }

    public void testPriceAbove40(){
        assertEquals(5400, above40NovelBook.getPrice());
    }
}
