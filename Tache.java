/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaches;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author mireille
 */
public class Tache {

    private static int compteurNumeroId;
    private Integer idtache;
    private String nomtache;
    private String description;
    private String datedebut;
    private String datefin;
    private String etat;
    private Membre membre;

    public static int getCompteurNumeroId() {
        return compteurNumeroId;
    }

    public static void setCompteurNumeroId(int compteurNumeroId) {
        Tache.compteurNumeroId = compteurNumeroId;
    }

    public Integer getIdtache() {
        return idtache;
    }

    public void setIdtache(Integer idtache) {
        this.idtache = idtache;
    }

    public String getNomtache() {
        return nomtache;
    }

    public void setNomtache(String nomtache) {
        this.nomtache = nomtache;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(String datedebut) {
        this.datedebut = datedebut;
    }

    public String getDatefin() {
        return datefin;
    }

    public void setDatefin(String datefin) {
        this.datefin = datefin;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.idtache);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tache other = (Tache) obj;
        if (!Objects.equals(this.idtache, other.idtache)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tache{" + "idtache=" + idtache + ", nomtache=" + nomtache + 
                ", description=" + description + ", datedebut=" + datedebut + 
                ", datefin=" + datefin + ", etat=" + etat + ", membre=" 
                + membre + '}';
    }
    
 

    public Tache(Integer idtache, String nomtache, String description,
            String datedebut, String datefin, String etat, Membre membre) {
        this.idtache = idtache;
        this.nomtache = nomtache;
        this.description = description;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.etat = etat;
        this.membre = membre;
    }

    public Tache() {
    }
 
}
