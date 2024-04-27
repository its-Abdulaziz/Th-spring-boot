package com.project.itunesAPI;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(value = "http://localhost:3000")
@RestController
public class PostController {
    private final Service service;

    public PostController(Service service) {
        this.service = service;
    }

    @GetMapping("/findResults/{search}")
    public ResponseEntity<List<Object>> findResults(@PathVariable("search") String search) {
        System.out.println(search);
     return service.findResults(search);
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<Object> deleteAll() {
        return service.deleteAll();
    }

}
