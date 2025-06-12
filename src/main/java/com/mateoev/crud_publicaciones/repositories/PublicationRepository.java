package com.mateoev.crud_publicaciones.repositories;

import com.mateoev.crud_publicaciones.entities.Publication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationRepository extends JpaRepository<Publication, Long> {
}
