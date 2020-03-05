package ru.cbr.tomsk.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cbr.tomsk.test.domain.LastName;
import ru.cbr.tomsk.test.repos.LastNameRepo;

import java.util.List;

@Service
public class LastNameService {
    @Autowired
    private LastNameRepo lastNameRepo;

    public List<LastName> listAll() {
        return (List<LastName>) lastNameRepo.findAll();
    }
}
