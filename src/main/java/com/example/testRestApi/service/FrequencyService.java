package com.example.testRestApi.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FrequencyService {

    public String getFrequency(String string) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                frequency.merge(string.charAt(i), 1, Integer::sum);
            }
        }
        List<Map.Entry<Character, Integer>> frequencyList = new ArrayList<>(frequency.entrySet());
        frequencyList.sort((o1, o2) -> o2.getValue() - o1.getValue());
        StringBuilder result = new StringBuilder();
        for (Map.Entry entry : frequencyList) {
            result.append("'").append(entry.getKey()).append("'").append(": ").append(entry.getValue()).append(", ");
        }
        return result.toString();
    }
}
