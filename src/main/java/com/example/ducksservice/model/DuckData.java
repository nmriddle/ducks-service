package com.example.ducksservice.model;

public record DuckData(int id, String type) {
    public static DuckData fromLine(String line) {
        String[] tokens = line.split(",");
        return new DuckData(Integer.parseInt(tokens[0]), tokens[1]);
    }

    public String toLine() {
        return String.format("%1$s,%2$s", id(), type());
    }
}
