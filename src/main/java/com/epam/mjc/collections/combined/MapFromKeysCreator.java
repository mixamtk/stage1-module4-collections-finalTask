package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for (String elem: sourceMap.keySet()) {
            if (!result.containsKey(elem.length()))
                result.put(elem.length(), new HashSet<>(List.of(elem)));
            else {
                result.get(elem.length()).add(elem);
            }
        }
        return result;
    }
}
