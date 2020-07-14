package com.ssoto.examen2.service;

import java.util.List;

import com.ssoto.examen2.domain.Journal;
import com.ssoto.examen2.repository.JournalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * JournalServiceImpl
 */
@Service
public class JournalServiceImpl implements JournalService {

    @Autowired
    JournalRepository journalRepository;

    @Override
    public void saveJournal(Journal newJournal) {
        journalRepository.save(newJournal);

    }

    @Override
    public List<Journal> getAllJournals() {
        return journalRepository.findAll();
    }

}
