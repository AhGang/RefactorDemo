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
            if (isNameNotEqualAGED_BRIEOrBACKSTAGE(items[i])) {
                if (items[i].quality > 0) {
                    if (isNameNotEqualSULFURAS(items[i], SULFURAS_HAND_OF_RAGNAROS)) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                    if (items[i].name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                        addQualityWhenNameEqualsBACKSTAGE(items[i]);
                    }
                }
            }

            if (isNameNotEqualSULFURAS(items[i], SULFURAS_HAND_OF_RAGNAROS)) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!isNameNotEqualAGED(items[i], AGED_BRIE)) {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                } else if (!isNameNotEqualBACKSTAGE(items[i], BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                    items[i].quality = 0;
                } else {
                    if (items[i].quality > 0) {
                        if (isNameNotEqualSULFURAS(items[i], SULFURAS_HAND_OF_RAGNAROS)) {
                            items[i].quality = items[i].quality - 1;
                        }
                    }
                }
            }
        }
    }

    private boolean isNameNotEqualBACKSTAGE(Item item, String backstagePassesToATafkal80EtcConcert) {
        return !item.name.equals(backstagePassesToATafkal80EtcConcert);
    }

    private boolean isNameNotEqualAGED(Item item, String agedBrie) {
        return !item.name.equals(agedBrie);
    }

    private boolean isNameNotEqualSULFURAS(Item item, String sulfurasHandOfRagnaros) {
        return !item.name.equals(sulfurasHandOfRagnaros);
    }

    private boolean isNameNotEqualAGED_BRIEOrBACKSTAGE(Item item) {
        return !item.name.equals(AGED_BRIE)
                && !item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT);
    }

    private void addQualityWhenNameEqualsBACKSTAGE(Item item) {
        if (item.quality < 50) {
            if (item.sellIn < 6) {
                item.quality += 2;
            } else if (6 < item.sellIn && item.sellIn < 11) {
                item.quality += 1;
            }
        }
    }
}