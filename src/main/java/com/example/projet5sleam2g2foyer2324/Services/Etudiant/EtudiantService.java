package com.example.projet5sleam2g2foyer2324.Services.Etudiant;

import com.example.projet5sleam2g2foyer2324.DAO.Entities.*;
import com.example.projet5sleam2g2foyer2324.DAO.Repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService {
    EtudiantRepository repo;

    @Override
    public Etudiant addOrUpdate(Etudiant e) {
        return repo.save(e);
    }

    @Override
    public List<Etudiant> findAll() {
        return repo.findAll();
    }

    @Override
    public Etudiant findById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public void deleteById(long id) {
        repo.deleteById(id);
    }

    @Override
    public void delete(Etudiant e) {
        repo.delete(e);
    }
}
