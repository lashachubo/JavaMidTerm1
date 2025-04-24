package t1;

import java.util.*;

public class t1 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(6, 10, 5, 2, 9, 4, 8, 3, 1, 7);

        List<String> list2 = Arrays.asList("din", "sao", "uoy", "pfe", "ejw", "nqm", "yji", "wfu", "ypi", "vto", "dqy", "tny");

        List<String> list3 = new ArrayList<>();

        for (int index : list1) {
            int adjustedIndex = index - 1;
            if (adjustedIndex >= 0 && adjustedIndex < list2.size()) {
                String value = list2.get(adjustedIndex);
                if (!list3.contains(value)) {
                    list3.add(value);
                }
            }
        }

        System.out.println("list3:");
        for (String s : list3) {
            System.out.println(s);
        }
    }
}
