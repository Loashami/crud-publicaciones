package com.mateoev.crud_publicaciones.services;

import java.util.List;

import com.mateoev.crud_publicaciones.entities.Publication;

public interface PublicationService {
  List<Publication> findAll();
}
