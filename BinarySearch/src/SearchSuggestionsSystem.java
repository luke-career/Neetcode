import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionsSystem {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < searchWord.length(); i++) {
            sb.append(searchWord.charAt(i));
            List<String> list = new ArrayList<>();
            int l = 0;
            int r = products.length;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (products[mid].compareTo(sb.toString()) < 0) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }
            for (int k = r; k < products.length && list.size() < 3; k++) {
                if (products[k].startsWith(sb.toString())) {
                    list.add(products[k]);
                }

            }
            res.add(list);
        }
        return res;
    }
}
