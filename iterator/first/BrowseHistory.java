package iterator.first;

import java.util.ArrayList;
import java.util.List;

class BrowseHistory {

    private List<String> urls = new ArrayList<>();

    void push(String url) {
        urls.add(url);
    }

    String pop() {
        int lastIndex = urls.size() - 1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);

        return lastUrl;
    }

    List<String> getUrls() {
        return urls;
    }

}
