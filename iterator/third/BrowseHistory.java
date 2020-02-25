package iterator.third;

public class BrowseHistory {

    private String[] urls = new String[10];
    private int count;

    void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    Iterator<String> createIterator() {
        return new ArrayIterator(this);
    }

    public static class ArrayIterator implements Iterator<String> {
        private BrowseHistory history;
        private int index;

        ArrayIterator(BrowseHistory history) {
            this.history = history;
        }


        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
