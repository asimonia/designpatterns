package iterator.third;

public class Main {
    public static void main(String[] args) {
        BrowseHistory history = new BrowseHistory();
        history.push("d");
        history.push("e");
        history.push("f");

        Iterator<String> iterator = history.createIterator();
        while (iterator.hasNext()) {
            String url = iterator.current();
            System.out.println(url);
            iterator.next();
        }

    }
}
