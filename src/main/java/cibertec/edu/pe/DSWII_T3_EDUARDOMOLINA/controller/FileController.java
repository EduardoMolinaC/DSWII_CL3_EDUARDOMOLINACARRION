package cibertec.edu.pe.DSWII_T3_EDUARDOMOLINA.controller;

import cibertec.edu.pe.DSWII_T3_EDUARDOMOLINA.model.response.ResponseFile;
import cibertec.edu.pe.DSWII_T3_EDUARDOMOLINA.service.FileService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/filesdoc")
public class FileController {

    @PostMapping
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        // Validar la extensión y el tamaño del archivo
        if (!file.getOriginalFilename().endsWith(".doc")) {
            return ResponseEntity.badRequest().body("El archivo debe tener extensión DOC.");
        }

        if (file.getSize() > 2 * 1024 * 1024) { // 2MB
            return ResponseEntity.badRequest().body("El tamaño del archivo no puede superar los 2MB.");
        }



        return ResponseEntity.ok("Archivo subido correctamente.");
    }
}