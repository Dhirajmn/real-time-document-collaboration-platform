package com.dhiraj.documentservice.controller;

import com.dhiraj.documentservice.dto.DocumentCreateRequestDto;
import com.dhiraj.documentservice.dto.DocumentEditRequestDto;
import com.dhiraj.documentservice.entity.Document;
import com.dhiraj.documentservice.response.ApiResponse;
import com.dhiraj.documentservice.service.DocumentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<Document>> createDocument(@Valid @RequestBody DocumentCreateRequestDto request) {

        ApiResponse<Document> response =
                new ApiResponse<>(
                        true,
                        "Document created successfully",
                        documentService.createDocument(request));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }

//    @PutMapping("/{id}")
//    public ResponseEntity<ApiResponse<Document>> editDocument(@PathVariable long id, @Valid @RequestBody DocumentEditRequestDto request) {
//        ApiResponse<Document> response =
//                new ApiResponse<>(
//                        true,
//                        "Document updated successfully",
//                        documentService.editDocument(id, request));
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }

//    @GetMapping
//    public ResponseEntity<ApiResponse<List<Document>>> getAllDocuments() {
//
//    }

//    @GetMapping("/{id}")
//    public ResponseEntity<ApiResponse<Document>> getDocument(@PathVariable long id) {
//
//    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<ApiResponse<Document>> deleteDocument(@PathVariable long id) {
//
//    }

}
