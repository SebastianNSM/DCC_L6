package com.ssoto.examen2.web;

import java.text.ParseException;

import com.ssoto.examen2.domain.Journal;
import com.ssoto.examen2.service.JournalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * JournalController
 */
@Controller
public class JournalController {

    @Autowired
    JournalService journalService;

    @GetMapping("/")
    public String index(Model model) throws ParseException {
        model.addAttribute("journal", journalService.getAllJournals());

        Journal newJournal = new Journal("Hola Mundo", "un saludo", "07/15/2017");
        journalService.saveJournal(newJournal);
        return "index";
    }

}
