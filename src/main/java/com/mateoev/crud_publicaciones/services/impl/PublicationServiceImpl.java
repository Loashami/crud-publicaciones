package com.mateoev.crud_publicaciones.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateoev.crud_publicaciones.repositories.PublicationRepository;
import com.mateoev.crud_publicaciones.services.PublicationService;

@Service
public class PublicationServiceImpl implements PublicationService {
    @Autowired
    private PublicationRepository publicationRepository;
}
