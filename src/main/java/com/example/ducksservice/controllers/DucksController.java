package com.example.ducksservice.controllers;

import com.example.ducksservice.model.DuckData;
import com.example.ducksservice.repository.DucksRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/ducks")
public class DucksController {

    DucksRepository ducksRepository;

    public DucksController() {
        ducksRepository = new DucksRepository();
    }

    @PostMapping
    public void add(@RequestBody DuckData duck) {
        try {
            ducksRepository.add(duck);
        } catch (IOException e) {
            System.out.println("Could not add.");
        }
    }

    @GetMapping
    public List<DuckData> findAll() {
        try {
            return ducksRepository.findAll();
        } catch (IOException e) {
            return null;
        }
    }

    @GetMapping("/find")
    public DuckData find(@RequestParam int id) {
        try {
            return ducksRepository.find(id);
        } catch (IOException e) {
            return null;
        }
    }

    @PostMapping("/{id}/image")
    public void updateImage(@RequestParam int id, @RequestParam MultipartFile file) {
        try {
            ducksRepository.updateImage(id, file);
        } catch (IOException e) {
            System.out.println("Update image failed.");
        }
    }

    @GetMapping("/{id}/image")
    public byte[] getImage(@RequestParam int id) {
        try {
            return ducksRepository.getImage(id);
        } catch (IOException e) {
            return null;
        }
    }

    @PostMapping("/{id}/audio")
    public void updateAudio(@RequestParam int id, @RequestParam MultipartFile file) {
        try {
            ducksRepository.updateAudio(id, file);
        } catch (IOException e) {
            System.out.println("Update audio failed.");
        }
    }

    @GetMapping("/{id}/audio")
    public byte[] getAudio(@RequestParam int id) {
        try {
            return ducksRepository.getAudio(id);
        } catch (IOException e) {
            return null;
        }
    }

    @GetMapping("/search")
    public List<DuckData> search(@RequestParam String type) {
        try {
            return ducksRepository.search(type);
        } catch (IOException e) {
            return null;
        }
    }

}
