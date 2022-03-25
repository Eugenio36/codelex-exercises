package io.codelex.collections.practice.phonebook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectoryEdited {
    private TreeMap<String, String> data;

    public PhoneDirectoryEdited() {
        data = new TreeMap<>();
    }

    public String getNumber(String name) {
        for (Map.Entry<String, String> i : data.entrySet()) {
            if (i.getKey().equals(name)) {
                return i.getValue();
            }
        }
        return null;
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        } else {
            data.put(name, number);
        }
    }

    @Override
    public String toString() {
        return "PhoneDirectory: " + data;
    }
}

