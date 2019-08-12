package gildedRose;

public class AgedBrieStrategy extends GildedRoseStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.quality < 50) {
            if (item.sellIn < 0) {
                item.quality += 1;
            }
            item.quality += 1;
        }
        item.sellIn -= 1;

    }
}
