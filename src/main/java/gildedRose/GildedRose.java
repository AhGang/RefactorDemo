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
                    updateAGED_BRIEQuality(items[i]);
                    break;
                case BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT:
                    updateBACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERTQuality(items[i]);
                    break;
                case SULFURAS_HAND_OF_RAGNAROS:
                    break;
                default:
                    updateOthersQuality(items[i]);
            }
        }
    }

    private void updateOthersQuality(Item item) {
        if (item.quality > 0) {
            if (item.sellIn < 0) {
                item.quality -= 1;
            }
            item.quality -= 1;
        }
        item.sellIn -= 1;
    }

    private void updateBACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERTQuality(Item item) {
        if (item.quality < 50) {
            item.quality += 1;
            if (item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                addQualityWhenNameEqualsBACKSTAGE(item);
            }
        }
        item.sellIn -= 1;
        if (item.sellIn < 0) {
            item.quality = 0;
        }else{

        }
    }

    private void updateAGED_BRIEQuality(Item item) {
        if (item.quality < 50) {
            if (item.sellIn < 0) {
                item.quality += 1;
            }
            item.quality += 1;
        }
        item.sellIn -= 1;
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