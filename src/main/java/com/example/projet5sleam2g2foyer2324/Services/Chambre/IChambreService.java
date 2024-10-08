package com.example.projet5sleam2g2foyer2324.Services.Chambre;

import com.example.projet5sleam2g2foyer2324.DAO.Entities.*;
import com.example.projet5sleam2g2foyer2324.DAO.Repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

public interface IChambreService {
    Chambre addOrUpdate(Chambre c);
    List<Chambre> findAll();
    Chambre findById(long id);
    void deleteById(long id);
    void delete(Chambre c);
    List<Chambre>  getChambresParNomBloc( String nomBloc);
    long  nbChambreParTypeEtBloc(TypeChambre type, long idBloc);
    List<Chambre>  getChambresNonReserveParNomFoyerEtTypeChambre( String nomFoyer,TypeChambre type);
    void listeChambresParBloc();
    void pourcentageChambreParTypeChambre();
    void nbPlacesDisponibleParChambreAnneeEnCours();



}
