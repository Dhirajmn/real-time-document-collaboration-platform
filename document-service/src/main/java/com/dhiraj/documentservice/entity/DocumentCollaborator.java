package com.dhiraj.documentservice.entity;

import com.dhiraj.documentservice.enums.DocumentPermission;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class DocumentCollaborator {

    @Id
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private long documentId;

    @Column(nullable = false)
    private long userId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private DocumentPermission documentPermission;
}
