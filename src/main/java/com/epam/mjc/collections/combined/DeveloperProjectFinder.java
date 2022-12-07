package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Set<String>> elem : projects.entrySet()) {
            if (elem.getValue().contains(developer))
                result.add(elem.getKey());
        }

        result.sort((o1, o2) -> {
            int diff;
            if (o1.length() == o2.length())
                diff = o1.compareTo(o2) * -1;
            else
                diff = o2.length() - o1.length();
            return diff;
        });
        return result;
    }
}
