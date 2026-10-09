package com.dhiraj.documentservice.repository;

import com.dhiraj.documentservice.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

    boolean findByCreatedBy(long createdBy);

    boolean existsByCreatedBy(long createdBy);
}
