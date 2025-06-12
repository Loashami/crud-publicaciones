package com.mateoev.crud_publicaciones.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateoev.crud_publicaciones.entities.Publication;
import com.mateoev.crud_publicaciones.repositories.PublicationRepository;
import com.mateoev.crud_publicaciones.services.PublicationService;

@Service
public class PublicationServiceImpl implements PublicationService {
    @Autowired
    private PublicationRepository publicationRepository;

    @Override
    public List<Publication> findAll() {
        return publicationRepository.findAll();
    }

    @Override
    public Publication save(Publication publication) {
        return publicationRepository.save(publication);
    }
}
