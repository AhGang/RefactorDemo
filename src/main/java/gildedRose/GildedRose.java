package gildedRose;

public class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name) {
                case AGED_BRIE:
                    new AgedBrieStrategy().updateQuality(items[i]);
                    break;
                case BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT:
                    new BackstageStrategy().updateQuality(items[i]);
                    break;
                case SULFURAS_HAND_OF_RAGNAROS:
                    break;
                default:
                    new OthersStrategy().updateQuality(items[i]);
            }
        }
    }
}