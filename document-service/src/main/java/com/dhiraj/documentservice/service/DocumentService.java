package com.dhiraj.documentservice.service;

import com.dhiraj.documentservice.dto.DocumentCreateRequestDto;
import com.dhiraj.documentservice.dto.DocumentEditRequestDto;
import com.dhiraj.documentservice.entity.Document;
import com.dhiraj.documentservice.repository.DocumentCollaboratorRepository;
import com.dhiraj.documentservice.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DocumentService {

    private final DocumentRepository documentRepository;
    private final DocumentCollaboratorRepository documentCollaboratorRepository;


    public DocumentService(DocumentRepository documentRepository, DocumentCollaboratorRepository documentCollaboratorRepository) {
        this.documentRepository = documentRepository;
        this.documentCollaboratorRepository = documentCollaboratorRepository;
    }

    public Document createDocument(DocumentCreateRequestDto request) {
        Document newDocument = new Document();
        newDocument.setTitle(request.getTitle());
        newDocument.setContent(request.getContent());
        newDocument.setCreatedAt(LocalDateTime.now());
//        newDocument.setCreatedBy(); // empty for now (auth-service pending)
        newDocument.setUpdatedAt(LocalDateTime.now());

        return documentRepository.save(newDocument);

    }

}
