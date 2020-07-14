package com.ssoto.examen2.repository;

import com.ssoto.examen2.domain.Journal;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JournalRepository
 */
public interface JournalRepository extends JpaRepository<Journal, Long> {
}
