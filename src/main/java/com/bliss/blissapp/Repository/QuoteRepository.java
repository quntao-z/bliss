package com.bliss.blissapp.Repository;

import com.bliss.blissapp.Model.Quote;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends MongoRepository<Quote, Long> {
}
