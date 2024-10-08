package com.example.projet5sleam2g2foyer2324.Services.Universite;

import com.example.projet5sleam2g2foyer2324.DAO.Entities.*;
import com.example.projet5sleam2g2foyer2324.DAO.Repositories.*;
import com.example.projet5sleam2g2foyer2324.Services.Universite.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {
    UniversiteRepository repo;

    @Override
    public Universite addOrUpdate(Universite u) {
        return repo.save(u);
    }

    @Override
    public List<Universite> findAll() {
        return repo.findAll();
    }

    @Override
    public Universite findById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public void deleteById(long id) {
        repo.deleteById(id);
    }

    @Override
    public void delete(Universite u) {
        repo.delete(u);
    }
}
