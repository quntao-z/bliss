package com.bliss.blissapp.Repository;

import com.bliss.blissapp.Model.Quote;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuoteRepository extends MongoRepository<Quote, Long> {
}
