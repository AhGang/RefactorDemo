package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {
    @Test
    public void should_return_updateQualityString_given_a_item_Aged_Brie_10_40() {
        //given
        Item item = new Item("Aged Brie",10,40);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Aged Brie, 9, 41");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_Aged_Brie_10_51() {
        //given
        Item item = new Item("Aged Brie",10,51);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Aged Brie, 9, 51");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_Aged_Brie_10_48() {
        //given
        Item item = new Item("Aged Brie",10,48);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Aged Brie, 9, 49");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_Aged_Brie_10_49() {
        //given
        Item item = new Item("Aged Brie",10,49);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Aged Brie, 9, 50");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_Aged_Brie_Negative1_40() {
        //given
        Item item = new Item("Aged Brie",-1,40);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Aged Brie, -2, 42");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_Aged_Brie_Negative1_51() {
        //given
        Item item = new Item("Aged Brie",-1,51);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Aged Brie, -2, 51");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert__10_40() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",10,40);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, 9, 42");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert__5_40() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",5,40);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, 4, 43");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert__12_40() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",12,40);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, 11, 41");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert__10_51() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",10,51);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, 9, 51");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert__5_48() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",5,48);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, 4, 51");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert__5_49() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",5,49);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, 4, 50");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert__Negative1_51() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",-1,51);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, -2, 0");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_Backstage_passes_to_a_TAFKAL80ETC_concert__Negative1_0() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",-1,0);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Backstage passes to a TAFKAL80ETC concert, -2, 0");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_Sulfuras_Hand_of_Ragnaros__10_40() {
        //given
        Item item = new Item("Sulfuras, Hand of Ragnaros",10,40);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Sulfuras, Hand of Ragnaros, 10, 40");
    }

    @Test
    public void should_return_updateQualityString_given_a_item_test_10_10() {
        //given
        Item item = new Item("Test",10,10);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Test, 9, 9");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_test_10_Negative1() {
        //given
        Item item = new Item("Test",10,-1);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Test, 9, -1");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_test_Negative1_1() {
        //given
        Item item = new Item("Test",-1,5);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Test, -2, 3");
    }
    @Test
    public void should_return_updateQualityString_given_a_item_test_Negative1_Negative1() {
        //given
        Item item = new Item("Test",-1,-1);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(gildedRose.items[0].toString(),"Test, -2, -1");
    }
}