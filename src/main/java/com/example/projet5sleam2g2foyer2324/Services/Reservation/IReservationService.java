package com.example.projet5sleam2g2foyer2324.Services.Reservation;

import com.example.projet5sleam2g2foyer2324.DAO.Entities.*;
import com.example.projet5sleam2g2foyer2324.DAO.Repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface IReservationService {
    Reservation addOrUpdate(Reservation r);
    List<Reservation> findAll();
    Reservation findById(String id);
    void deleteById(String id);
    void delete(Reservation r);
    Reservation ajouterReservationEtAssignerAChambreEtAEtudiant (Long numChambre, long cin) ;
    long  getReservationParAnneeUniversitaire(LocalDate debutAnnee, LocalDate finAnnee ) ;
    String annulerReservation (long cinEtudiant) ;

    void affectReservationAChambre(String idRes,long idChambre);
    void annulerReservations();




}
