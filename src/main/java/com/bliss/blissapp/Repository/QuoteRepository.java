package com.bliss.blissapp.Repository;

import com.bliss.blissapp.Model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
}
