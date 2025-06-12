package com.mateoev.crud_publicaciones.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

}
