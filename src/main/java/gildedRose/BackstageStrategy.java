package gildedRose;

public class BackstageStrategy extends GildedRoseStrategy{
    @Override
    public void updateQuality(Item item) {
        if (item.quality < 50) {
            item.quality += 1;
                addQualityWhenNameEqualsBACKSTAGE(item);
        }
        item.sellIn -= 1;
        if (item.sellIn < 0) {
            item.quality = 0;
        }

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
