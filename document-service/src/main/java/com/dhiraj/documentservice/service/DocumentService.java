package com.dhiraj.documentservice.service;

import com.dhiraj.documentservice.dto.DocumentCreateRequestDto;
import com.dhiraj.documentservice.dto.DocumentEditRequestDto;
import com.dhiraj.documentservice.entity.Document;
import com.dhiraj.documentservice.repository.DocumentCollaboratorRepository;
import com.dhiraj.documentservice.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

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

    public /*Document*/void editDocument(DocumentEditRequestDto request) {

        // check: document exists

        // check: authorized user

    }

    public /*List<Document>*/void getAllDocuments() {

        // check: who is making request

        // get: all documents associated with the authenticated user, regardless of whether their permission is OWNER, EDITOR, or VIEWER.
    }

    public /*Document*/void getDocument(long id) {

        // check: document exists

        // check: authorized user

        // get: doc
    }

    public void deleteDocument(long id) {

        // check: document exists

        // check: authorized user

        // delete: if above satisfies
    }

}
