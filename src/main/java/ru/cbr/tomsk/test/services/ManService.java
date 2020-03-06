package ru.cbr.tomsk.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cbr.tomsk.test.domain.LastName;
import ru.cbr.tomsk.test.domain.Man;
import ru.cbr.tomsk.test.repos.LastNameRepo;
import ru.cbr.tomsk.test.repos.ManRepo;

import java.util.List;

@Service
public class ManService {
    @Autowired
    private ManRepo manRepo;

    public List<Man> listAll() {
        return (List<Man>) manRepo.findAll();
    }
}
