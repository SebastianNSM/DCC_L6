package com.ssoto.examen2.service;

import java.util.List;

import com.ssoto.examen2.domain.Journal;

/**
 * JournalService
 */
public interface JournalService {

    public void saveJournal(Journal newJournal);

    public List<Journal> getAllJournals();

}
