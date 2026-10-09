package com.dhiraj.documentservice.repository;

import com.dhiraj.documentservice.entity.DocumentCollaborator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentCollaboratorRepository extends JpaRepository<DocumentCollaborator, Long> {
}
