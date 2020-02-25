package iterator.second;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private List<String> urls = new ArrayList<>();

    void push(String url) {
        urls.add(url);
    }

    public String pop() {
        int lastIndex = urls.size() - 1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);

        return lastUrl;
    }

    Iterator<String> createIterator() {
        return new ListIterator(this);
    }

    public static class ListIterator implements Iterator<String> {
        BrowseHistory history;
        private int index;

        ListIterator(BrowseHistory history) {
            this.history = history;
        }


        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
