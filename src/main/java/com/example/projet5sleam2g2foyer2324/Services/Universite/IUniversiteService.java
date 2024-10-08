package com.example.projet5sleam2g2foyer2324.Services.Universite;

import com.example.projet5sleam2g2foyer2324.DAO.Entities.*;
import com.example.projet5sleam2g2foyer2324.DAO.Repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

public interface IUniversiteService {
    Universite addOrUpdate(Universite u);
    List<Universite> findAll();
    Universite findById(long id);
    void deleteById(long id);
    void delete(Universite u);
}
