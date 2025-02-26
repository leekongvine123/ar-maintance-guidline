package com.capstone.ar_guideline.controllers;

import com.capstone.ar_guideline.services.impl.FileStorageService;
import java.nio.file.Files;
import java.nio.file.Path;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/files")
public class FileUploadController {

  private final FileStorageService fileStorageService;

  public FileUploadController(FileStorageService fileStorageService) {
    this.fileStorageService = fileStorageService;
  }

  @GetMapping("/{filename}")
  public ResponseEntity<Resource> getFile(@PathVariable String filename) {
    try {
      Resource resource = fileStorageService.getFile(filename);
      Path filePath = resource.getFile().toPath();
      String contentType = Files.probeContentType(filePath);

      return ResponseEntity.ok()
          .contentType(
              MediaType.parseMediaType(
                  contentType != null ? contentType : "application/octet-stream"))
          .body(resource);
    } catch (Exception e) {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping("/upload")
  public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
    String filePath = fileStorageService.storeFile(file);
    return ResponseEntity.ok("File stored at: " + filePath);
  }
}
