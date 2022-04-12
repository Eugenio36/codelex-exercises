package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneDirectoryEdited {

    private final TreeMap<String, String> data;

    public PhoneDirectoryEdited() {
        data = new TreeMap<>();
    }

    public String getNumber(String name) {
        return data.get(name);
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

