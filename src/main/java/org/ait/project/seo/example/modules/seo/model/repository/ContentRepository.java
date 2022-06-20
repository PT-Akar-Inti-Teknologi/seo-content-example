package org.ait.project.seo.example.modules.seo.model.repository;

import org.ait.project.seo.example.modules.seo.model.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContentRepository extends JpaRepository<Content, Integer> {

    Optional<Content> findByUrl(String url);

}
