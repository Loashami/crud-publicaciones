package com.mateoev.crud_publicaciones.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mateoev.crud_publicaciones.entities.Publication;
import com.mateoev.crud_publicaciones.services.PublicationService;

@RestController
@RequestMapping("/api/publications")
public class PublicationController {
  @Autowired
  private PublicationService publicationService;

  @GetMapping
  public List<Publication> getAll() {
    return publicationService.findAll();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    if (!publicationService.findById(id).isPresent()) {
      return ResponseEntity.notFound().build();
    }
    publicationService.deleteById(id);
    return ResponseEntity.noContent().build();
  }

  @PostMapping
  public Publication create(@RequestBody Publication publication) {
    return publicationService.save(publication);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Publication> update(@PathVariable Long id, @RequestBody Publication publication) {
    if (!publicationService.findById(id).isPresent()) {
      return ResponseEntity.notFound().build();
    }
    publication.setId(id);
    return ResponseEntity.ok(publicationService.save(publication));
  }
}
