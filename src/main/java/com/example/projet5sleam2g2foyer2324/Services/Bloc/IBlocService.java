package com.example.projet5sleam2g2foyer2324.Services.Bloc;


import com.example.projet5sleam2g2foyer2324.DAO.Entities.*;

import java.util.List;

public interface IBlocService {
    Bloc addOrUpdate(Bloc b);
    Bloc addOrUpdate2(Bloc b);

    List<Bloc> findAll();

    Bloc findById(long id);

    void deleteById(long id);

    void delete(Bloc b);

    Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc);
    Bloc affecterBlocAFoyer( String nomBloc,  String nomFoyer) ;


}
