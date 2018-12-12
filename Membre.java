/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaches;

import java.util.Objects;

/**
 *
 * @author mireille
 */
public class Membre {

    private Integer idmembre;
    private String nommembre;
    private String prenom;
    private String adresse;
    private String telephone;
    private String mail;
    
        
    public Integer getIdmembre() {
        return idmembre;
    }

    public void setIdmembre(Integer idm) {
        this.idmembre = idm;
    }

    public String getNomembre() {
        return nommembre;
    }
    public void setNomembre(String nm) {
        this.nommembre = nm;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenm) {
        this.prenom = prenm;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adres) {
        this.adresse = adres;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telp) {
        this.telephone = telp;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String email) {
        this.mail = email;
    }

    public Membre(Integer idmembre, String nommembre, String prenom, 
            String adresse, String telephone, String mail) {
        this.idmembre = idmembre;
        this.nommembre = nommembre;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.mail = mail;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.idmembre);
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
        final Membre other = (Membre) obj;
        if (!Objects.equals(this.idmembre, other.idmembre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Membre{" + "idmembre=" + idmembre + ", nommembre=" + 
                nommembre + ", prenom=" + prenom + ", adresse=" + adresse + 
                ", telephone=" + telephone + ", mail=" + mail + '}';
    }

    public Membre() {
    }
    
    

}
