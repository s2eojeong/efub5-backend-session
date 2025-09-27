package com.practice.blog.account.repository;

import com.practice.blog.account.entity.AccountDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountDocumentRepository extends MongoRepository<AccountDocument, String> {
}
