package com.thenewboston.masterflow.placeholder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    public static final List<PlaceholderItem> ITEMS = new ArrayList<PlaceholderItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, PlaceholderItem> ITEM_MAP =
            new HashMap<String, PlaceholderItem>();

    static {
        // Add 3 sample items.
        addItem(new PlaceholderItem("1", "eBay",
                "http://www.ebay.com"));
        addItem(new PlaceholderItem("2", "Amazon",
                "http://www.amazon.com"));
        addItem(new PlaceholderItem("3", "Wikipedia",
                "http://www.wikipedia.org"));
    }

    private static void addItem(PlaceholderItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    /**
     * A placeholder item representing a piece of content.
     */
    public static class PlaceholderItem {
        public final String id;
        public final String itemName;
        public final String url;

        public PlaceholderItem(String id, String itemName, String url) {
            this.id = id;
            this.itemName = itemName;
            this.url = url;
        }

        @Override
        public String toString() {
            return itemName;
        }
    }
}