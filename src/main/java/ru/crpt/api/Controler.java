package ru.crpt.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
private final CreatDocService creatDocService;

    public Controler(CreatDocService creatDocService) {
        this.creatDocService = creatDocService;
    }

    @PostMapping("/ismp.crpt.ru/api/v3/lk/documents/create")
    public ResponseEntity<Document> addDocument(@PathVariable("id") String id,
                                                @RequestBody CreatDocService creatDocService) {
        return ResponseEntity.ok(creatDocService.addDoc(id, creatDocService));
    }
}