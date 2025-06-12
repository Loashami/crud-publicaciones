package com.mateoev.crud_publicaciones.services;

import java.util.List;
import java.util.Optional;

import com.mateoev.crud_publicaciones.entities.Publication;

public interface PublicationService {
  List<Publication> findAll();

  Optional<Publication> findById(Long id);

  Publication save(Publication publication);
}
