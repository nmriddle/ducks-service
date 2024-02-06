package com.example.ducksservice.repository;

import com.example.ducksservice.model.DuckData;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DucksRepositoryTest {

    @Test
    void addDuck1() {
        DucksRepository ducksRepository = new DucksRepository();
        String filePath = "ducks/db.txt";
        try {
            ducksRepository.addDuck(new DuckData(1, "Mallard"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            assertEquals(br.readLine(), "1,Mallard");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void addDuck2() {
        DucksRepository ducksRepository = new DucksRepository();
        String filePath = "ducks/db.txt";
        try {
            ducksRepository.addDuck(new DuckData(1, "Mallard"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            assertEquals("1,Mallard", br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            ducksRepository.addDuck(new DuckData(2, "Rubber_Duck"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            assertEquals("2,Rubber_Duck", br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void getAllDucks() {
        DucksRepository ducksRepository = new DucksRepository();
        try {
            ducksRepository.addDuck(new DuckData(1, "Mallard"));
            ducksRepository.addDuck(new DuckData(2, "Decoy_Duck"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            List<DuckData> ducks = ducksRepository.getAllDucks();
            assertEquals(1, ducks.get(0).id());
            assertEquals(2, ducks.get(1).id());
            assertEquals("Mallard", ducks.get(0).type());
            assertEquals("Decoy_Duck", ducks.get(1).type());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void getDuck() {
        DucksRepository ducksRepository = new DucksRepository();
        try {
            ducksRepository.addDuck(new DuckData(1, "Mallard"));
            ducksRepository.addDuck(new DuckData(2, "Decoy_Duck"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            assertEquals("Mallard",ducksRepository.getDuck(1).type());
            assertEquals("Decoy_Duck",ducksRepository.getDuck(2).type());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void search() {
        DucksRepository ducksRepository = new DucksRepository();
        try {
            ducksRepository.addDuck(new DuckData(1, "Mallard"));
            ducksRepository.addDuck(new DuckData(2, "Decoy_Duck"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            assertEquals(1,ducksRepository.search("Mallard").get(0).id());
            assertEquals(2,ducksRepository.search("Decoy_Duck").get(0).id());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}