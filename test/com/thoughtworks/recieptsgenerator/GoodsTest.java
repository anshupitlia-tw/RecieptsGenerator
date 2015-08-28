package com.thoughtworks.recieptsgenerator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodsTest {

    @Test
    public void shouldHaveNoSalesTaxAppliedIfItIsBook() {
        Goods goods = new Goods("book", 12.49);

        assertEquals(0.0, goods.salesTax(), 0.0001);
    }

    @Test
    public void shouldHaveASalesTaxOfTenPercentAppliedIfNotABook() {
        Goods goods = new Goods("a music cd", 14.99);

        assertEquals(1.499, goods.salesTax(), 0.0001);
    }

    @Test
    public void shouldHaveNoSalesTaxAppliedIfItIsAChocolateBar() {
        Goods goods = new Goods("a chocolate bar", 0.85);

        assertEquals(0.0, goods.salesTax(), 0.0001);
    }

    @Test
    public void shouldHaveNoSalesTaxAppliedIfItIsAPacketOfHeadachePills() {
        Goods goods = new Goods("a packet of headache pills", 9.75);

        assertEquals(0.0, goods.salesTax(), 0.0001);
    }

    @Test
    public void shouldHaveNoSalesTaxAppliedIfItIsABoxOfChocolates() {
        Goods goods = new Goods("a box of chocolates", 11.25);

        assertEquals(0.0, goods.salesTax(), 0.0001);
    }
}
