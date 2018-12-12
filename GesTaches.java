/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mireille
 */
public class GesTaches {
    public static List<Membre> listeMembre = new ArrayList<>();
    public static List<Tache> listeTache = new ArrayList<>();
    private static int entree;
    private static Scanner sc = new Scanner(System.in);

    public static void main(final String[] args) {
        accueil();
        menuGeneral();
         

}
    public static void menuGeneral() {
        while (true) {
            menuPrincipal();
            entree = 0;
            vericationDeLaSaisie(1, 12);
            switch (entree) {
                case 1:
                    entree = 0;
                    menuCreationMembre();
                    vericationDeLaSaisie(1, 2);
                    createMembreOptions(entree);
                    break;
                case 2:
                    entree = 0;
                    menuCreationTache();
                    vericationDeLaSaisie(1, 2);
                    createTacheOptions(entree);
                    break;
                case 3:
                    listerMembres();
                    break;
                case 4:
                    listerTaches();
                    break;
                case 5:
                    assignerTache();
                    break;
                case 6:
                    reassignerTaches();
                    break;
                case 7:
                    listTacheParMembre();
                    break;
                case 8:
                    rechercheMembres();
                    break;
                case 9:
                    rechercheTaches();
                    break;
                case 10:
                    modifierMembre();
                    break;
                case 11:
                    modifierTache();
                    break;
                case 12:
                    mettreFinAuProgramme();
                    break;
            }
        }
    }

    private static void accueil() {
    
        System.out.println(" TP1 Génie Logiciel Avancé.  AZEMENA Henri Joel et"
                + " DEGUE Akouvi Mireille\n");
        System.out.println("____________________"
                + "_____________\n");
    }

    private static void menuPrincipal() {
        System.out.print("\n\t\tMENU PRINCIPAL DE GESTION DE TACHES\n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.print("1 : CREATION D'UN NOUVEAU MEMBRE \n");
        System.out.print("2 : CREATION D'UNE NOUVELLE TACHE\n");
        System.out.print("3 : LISTE DES MEMBRES\n");
        System.out.print("4 : LISTE DES TACHES\n");
        System.out.print("5 : ASSIGNER UNE TACHE À UN MEMBRE \n");
        System.out.print("6 : REASSIGNER D'UNE TACHE À UN MEMBRE \n");
        System.out.print("7 : RECHERCHER ET AFFICHER TACHES PAR MEMBRES \n");
        System.out.print("8 : RECHERCHER MEMBRES\n");
        System.out.print("9 : RECHERCHER TACHE\n");
        System.out.print("10 : MODIFIER UN MEMBRE\n");
        System.out.print("11 : MODIFIER UNE TACHE\n");
        System.out.print("12 : FIN\n");
        System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "~~~~~\n\nChoix : ");
    }
    
//Vérification numéro choix des menus
    private static void vericationDeLaSaisie(int borneInferieure,
            int borneSuperieure) {
        verificationTypeDeDonnee();

        while (entree < borneInferieure || entree > borneSuperieure) {

            entree = sc.nextInt();
            if (entree < borneInferieure || entree > borneSuperieure) {
                System.out.println("Entrez un numero entre " + borneInferieure
                        + " et " + borneSuperieure + "\n");
            }
        }
    }
  
    //Fonction de verification de type 
    private static void verificationTypeDeDonnee() {
        if (!sc.hasNextInt()) {
            System.out.print("Saisir votre numero d'operation !!!\nChoix :");
            sc.nextLine();
            verificationTypeDeDonnee();
        }
    }
    //Menu de création de membre
    private static void menuCreationMembre() {
        System.out.print("\n\t\tCREATION D'UN NOUVEAU MEMBRE\n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.print("1 : NOUVEAU MEMBRE\n");
        System.out.print("2 : SORTIR\n");
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "~~~~\n\nChoix : ");
    }
    //Menu de création de membre
    private static void menuCreationTache() {
        System.out.print("\n\t\tCREATION D'UN NOUVELLE TACHE\n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.print("1 : NOUVELLE TACHE\n");
        System.out.print("2 : SORTIR\n");
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "~~~~\nChoix : ");
    }
    public static void createTacheOptions(int entre) {
        switch (entre) {
            case 1:
                createTacheNotExist();
                break;
         
            case 2:

                System.out.println("\n!!! Action annulee. "
                        + "Retour au menu principal !!!");
                break;
        }
    }
    public static void createMembreOptions(int entre) {
        switch (entre) {
            case 1:
                createMembreNotExist();
                break;
         
            case 2:

                System.out.println("\n!!! Action annulee. "
                        + "Retour au menu principal !!!");
                break;
        }
    }
    private static void createMembreNotExist() {
        System.out.print("\n~~~CREATION D'UN MEMBRE~~~\n\n");
        System.out.print("_______INFOS MEMBRE_____ : \n");
        System.out.print("NOM DU MEMBRE : \n");
        sc.nextLine();
        String nom = sc.nextLine();
        System.out.print("PRENOM : \n");
        String prenom = sc.nextLine();
        System.out.print("ADRESSE : \n");
        String adresse = sc.nextLine();
        System.out.print("TELEPHONE : \n");
        String telephone = sc.nextLine();
        System.out.print("EMAIL : \n");
        String mail = sc.nextLine();

       
        System.out.print("Voulez-vous enregistrer ce membre?\t1 : OUI\t2 :"
                + " NON\n");
        vericationDeLaSaisie(1, 2);
        entree = sc.nextInt();
        if (entree == 1) {
            Membre m = new Membre();
            m.setNomembre(nom);
            m.setIdmembre(genererIdMembre());
            m.setPrenom(prenom);
            m.setAdresse(adresse);
            m.setTelephone(telephone);
            m.setMail(mail);
            listeMembre.add(m);
            System.out.print("Opération enregistrée\n");
            menuGeneral();
        } else {
            System.out.print("Opération annulée\n");
            menuGeneral();
        }

        entree = 0;
    }
    //Génération automatique du numéro du membre
    public static int genererIdMembre() {
        int num = 0;
        if (listeMembre.isEmpty()) {
            num += 1;
        } else {
            num = listeMembre.indexOf(0);

            for (Membre m : listeMembre) {
                if (m.getIdmembre() > num) {
                    num = m.getIdmembre();
                }
            }
            num++;
        }
        return num;
    }
     //Génération automatique du numéro du membre
    public static int genererIdTache() {
        int num = 0;
        if (listeTache.isEmpty()) {
            num += 1;
        } else {
            num = listeTache.indexOf(0);

            for (Tache t : listeTache) {
                if (t.getIdtache() > num) {
                    num = t.getIdtache();
                }
            }
            num++;
        }
        return num;
    }
       //Création de compte si le titulaire n'existe pas déja
    private static void createTacheNotExist() {
        System.out.print("\n~~~CREATION D'UNE TACHE~~~\n");
        System.out.print("NOM DE LA TACHE : \n");
        sc.nextLine();
        String nom = sc.nextLine();
        System.out.print("DESCRIPTION DE LA TACHE : \n");
        String description = sc.nextLine();
        System.out.print("DATE DE DEBUT DE LA TACHE au Format 'dd MM yyyy': \n");
        String datedebut = sc.nextLine();
        System.out.print("DATE DE FIN DE LA TACHE au Format 'dd MM yyyy': \n");
        String datefin = sc.nextLine();   
        System.out.print("ETAT DE LA TACHE : \n");
        String etat = sc.nextLine();
        System.out.print("Voulez-vous enregistrer cette tache?\t1 : OUI\t2 :"
                + " NON\n");
        vericationDeLaSaisie(1, 2);
        entree = sc.nextInt();
        if (entree == 1) {
            Tache t = new Tache();
            t.setIdtache(genererIdTache());
            t.setDatedebut(datedebut);
            t.setDatefin(datefin);
            t.setNomtache(nom);
            t.setDescription(description);
            t.setEtat(etat);
            listeTache.add(t);
            System.out.print("Opération enregistrée\n");
            menuGeneral();
        } else {
            System.out.print("Opération annulée\n");
            menuGeneral();
        }

        entree = 0;
    }
//Fonction de verification de type 
    private static void verificationTypeDeDonneeNombre(int type) {
        switch (type) {
            case 1:
                if (!sc.hasNextInt()) {
                    System.out.print("Veuillez Saisir un nombre entier !!!\n ");
                    sc.nextLine();
                    verificationTypeDeDonneeNombre(type);
                }
                break;
            case 2:
                if (!sc.hasNextDouble()) {
                    System.out.print("Veuillez Saisir un nombre !!!\n ");
                    sc.nextLine();
                    verificationTypeDeDonneeNombre(type);
                }
                break;
        }

    }
    //Affiche la liste des Membres
    private static void listerMembres() {
        System.out.print("\n\n~~~LISTE DES MEMBRES~~~\n\n");
        String leftAlignFormat = "| %-5d | %-10s | %-10s | %-10s | %-10s | %-10s |%n";

        System.out.format("+----+-------+----------+-------+------+----------+%n");
        System.out.format("|Numero ID|  Nom   |  Prenom  | Adresse  | Telephone | Mail |%n");
        System.out.format("+----+-------+--------+---------+----------+------+%n");
        for (Membre tt : listeMembre) {
            System.out.format(leftAlignFormat, tt.getIdmembre(),
                    tt.getNomembre(), tt.getPrenom(), tt.getAdresse(), 
                    tt.getTelephone(), tt.getMail());
            System.out.format("|---------|------------|-----------|------------|----------|--------"
                    + "--|%n");
        }

        entree = 0;
    }
        //Affiche la liste des Taches
    private static void listerTaches() {
        System.out.print("\n\n~~~LISTE DES TACHES~~~\n\n");
        String leftAlignFormat = "| %-5d | %-10s | %-10s | %-10s | %-10s | %-10s |%n";

        System.out.format("+------+--------+------+--------+----------+---------+%n");
        System.out.format("|Numero ID|  Nom   |  Description  | Date debut  | "
                + " Date fin |     Etat   |%n");
        System.out.format("+-----------+---------------------------------+%n");
        for (Tache tt : listeTache) {
            System.out.format(leftAlignFormat, tt.getIdtache(),
                    tt.getNomtache(), tt.getDescription(), tt.getDatedebut(),
                    tt.getDatefin(), tt.getEtat());
            System.out.format("|-----|------|--------|---------|--------|-----"
                    + "--|%n");
        }

        entree = 0;
    }
//Liste de Taches par Membre
    public static void listTacheParMembre() {
        String leftAlignFormat = "| %-5s | %-10s | %-10s |%-10s | %-10s |%n";
        System.out.print("\n\n~~~RECHERCHER TACHE D'UN MEMBRE ~~~\n\n");
        System.out.println("Entrer le numéro d'identification du Membre");
        int IdMembre = sc.nextInt();
        Membre m = membreIsExist(IdMembre);
            Tache t=new Tache();
        if (m!= null){
           
            System.out.print("_______INFOS _______ : \n");
            System.out.println("Code Membre= " + m.getIdmembre()
              + "Nom =  " + m.getNomembre() + "Prenom =  " + m.getPrenom()+
           "Nom tache =  " + t.getNomtache()+" Description tache = " + t.getDescription());
          System.out.format("+----+--------+--------+---------+-----------+%n");  
           }
         else 
            System.out.println("Désolé ce Membre n'existe pas  ou n'a pas de tadche assigné!!");
        
        }
    
    
    //verification de membre dans la liste
    public static Membre membreIsExist(int num) {
        for (Membre tt : listeMembre) {
            if (num == tt.getIdmembre()) {
                return tt;
            }
        }
        return null;
    }
    //Rechercher un Membre
    public static void rechercheMembres() {
        String leftAlignFormat = "| %-5s | %-10s |%-10s |%-10s |%-10s |%n";
        System.out.print("\n\n~~~RECHERCHER UN MEMBRE ~~~\n\n");
        System.out.println("Entrer le numéro d'identification du Membre");
        int IdMembre = sc.nextInt();
        Membre m = membreIsExist(IdMembre);
        if (m != null) {
            System.out.print("_______INFOS MEMBRE_____ : \n");
            System.out.println("Code =" + m.getIdmembre()+
                   "nom : "+m.getNomembre()+ "  Prénom : "
                    +m.getPrenom()+ "  Adresse : "+m.getAdresse()+
                    "  Telephone : "+m.getTelephone());
            System.out.format("+------+----------+----------+----------+%n");
           
        } else {
            System.out.println("Désolé ce Membre n'existe pas !!");
        }
    }
      //R
    public static void rechercheTaches() {
        String leftAlignFormat = "| %-5s | %-10s |%-10s |%-10s |%-10s |%-10s |%n";
        System.out.print("\n\n~~~RECHERCHER UNE TACHE ~~~\n\n");
        System.out.println("Entrer le code de la tache");
        int IdTache = sc.nextInt();
        Tache t = tacheIsExist(IdTache);
        if (t != null) {
            System.out.print("_______INFOS TACHE : \n");
            System.out.println("Code =" + t.getIdtache()+
                   "nom : "+t.getNomtache()+ "  Description : "
                    +t.getDescription()+ "  Date debut : "+t.getDatedebut()+
                    "  Date fin : "+t.getDatefin()+ "  Etat: "+t.getEtat());
            System.out.format("+------+-------+------+--------+------+-----+%n");
           
        } else {
            System.out.println("Désolé cette tache n'existe pas !!");
        }
    }
      //verification existence de  tache 
    public static Tache tacheIsExist(int num) {
        for (Tache tt : listeTache) {
            if (num == tt.getIdtache()) {
                return tt;
            }
        }
        return null;
    }
     //Fin du programme
    private static void mettreFinAuProgramme() {
        System.out.println("\nFermeture du programme !\n");
        System.exit(0);
    }
    public static void modifierMembre(){
        listerMembres();
        System.out.print("Entrer le code du membre à modifier \n");
        int IdMembre = sc.nextInt();
        Membre m = membreIsExist(IdMembre);
        if(m!=null){
            System.out.print("1. Tapez 1 pour modifier le nom du membre \n");
            System.out.print("2. Tapez 2 pour modifier le prénom du membre \n");
            System.out.print("3. Tapez 3 pour modifier l'adresse du membre \n");
            System.out.print("4. Tapez 4 pour modifier le téléphone du membre \n");
            System.out.print("5. Tapez 5 pour modifier le mail du membre \n");
            System.out.print("6. Sortir \n");
            entree=sc.nextInt();
          switch (entree) {     
            case 1:
                System.out.print("Entrer le nouveau nom du membre \n");
                sc.nextLine();
                String nom= sc.nextLine();
                System.out.print("Voulez-vous enregistrer la modification?\t1 : OUI\t2 :"
                + " NON\n");
                vericationDeLaSaisie(1, 2);
                 if ((sc.nextInt()) == 1) {
                 m.setNomembre(nom);
                 listerMembres();
                 } 
            else {
                 System.out.print("Opération annulée\n");
                 menuGeneral();
                }
                break;
            case 2:
                System.out.print("Entrer le nouveau nom du membre \n");
                String prenom= sc.nextLine();
                System.out.print("Voulez-vous enregistrer la modification?\t1 : OUI\t2 :"
                + " NON\n");
                vericationDeLaSaisie(1, 2);
                 if ((sc.nextInt()) == 1) {
                 m.setNomembre(prenom);
                 listerMembres();
                 }
                 else {
                 System.out.print("Opération annulée\n"); 
                }
                break;
            case 3:
                System.out.print("Entrer le nouveau nom du membre \n");
                sc.nextLine();
                String adresse= sc.nextLine();
                System.out.print("Voulez-vous enregistrer la modification?\t1 : OUI\t2 :"
                + " NON\n");
                vericationDeLaSaisie(1, 2);
                 if ((sc.nextInt()) == 1) {
                 m.setNomembre(adresse);
                 listerMembres();
                 }
                 else {
                 System.out.print("Opération annulée\n");
                 }
                break;
            case 4:
                System.out.print("Entrer le nouveau nom du membre \n");
                String tel= sc.nextLine();
                System.out.print("Voulez-vous enregistrer la modification?\t1 : OUI\t2 :"
                + " NON\n");
                vericationDeLaSaisie(1, 2);
                 if ((sc.nextInt()) == 1) {
                 m.setNomembre(tel);
                 listerMembres();
                 }
                 else {
                 System.out.print("Opération annulée\n");
                }
                break;
            case 5:
                System.out.print("Entrer le nouveau nom du membre \n");
                String mail= sc.nextLine();
                System.out.print("Voulez-vous enregistrer la modification?\t1 : OUI\t2 :"
                + " NON\n");
                vericationDeLaSaisie(1, 2);
                 if ((sc.nextInt()) == 1) {
                 m.setNomembre(mail);
                 listerMembres();
                 }
                 else {
                 System.out.print("Opération annulée\n");
                }
                break;
            case 6:
                mettreFinAuProgramme();
                break;
        }    
       }
    }
    public static void modifierTache(){
        //listerTaches();
        System.out.print("Entrer le code de la tache à modifier \n");
        int IdTache = sc.nextInt();
        Tache t = tacheIsExist(IdTache);
        if(t!=null){
            System.out.println("1. Tapez 1 pour modifier le nom de la tache");
            System.out.println("2. Tapez 2 pour modifier la description de la tache");
            System.out.println("3. Tapez 3 pour modifier la date du debut de la tache");
            System.out.println("4. Tapez 4 pour modifier la date de fin de la tache");
            System.out.println("5. Tapez 5 pour modifier l'état de la tache");
            System.out.println("6. Sortir");
            entree = sc.nextInt();
          switch (entree) {     
            case 1:
                 System.out.print("Entrer le nouveau nom de la tache \n");
                sc.nextLine();
                String nom= sc.nextLine();
                System.out.print("Voulez-vous enregistrer la modification?\t1 : OUI\t2 :"
                + " NON\n");
                vericationDeLaSaisie(1, 2);
                 if ((sc.nextInt()) == 1) {
                 t.setNomtache(nom);
                 listerTaches();
                 }
                 else {
                 System.out.print("Opération annulée\n");
                }
                  break;
            case 2:
                 System.out.print("Entrer la nouvelle description de la tache \n");
                String description= sc.nextLine();
                System.out.print("Voulez-vous enregistrer la modification?\t1 : OUI\t2 :"
                + " NON\n");
                vericationDeLaSaisie(1, 2);
                 if ((sc.nextInt()) == 1) {
                 t.setDescription(description);
                 listerMembres();
                 }
                break;
            case 3:
                System.out.println("Entrer la nouvelle date de début de la tache");
                String datedebut= sc.nextLine();
                System.out.print("Voulez-vous enregistrer la modification?\t1 : OUI\t2 :"
                + " NON\n");
                vericationDeLaSaisie(1, 2);
                 if ((sc.nextInt()) == 1) {
                 t.setDatedebut(datedebut);
                 listerTaches();
                 }
                 else {
                 System.out.print("Opération annulée\n");
                }
                break;
            case 4:
                System.out.println("Entrer la nouvelle date de fin de la tache");
                String datefin= sc.nextLine();
                System.out.print("Voulez-vous enregistrer la modification?\t1 : OUI\t2 :"
                + " NON\n");
                vericationDeLaSaisie(1, 2);
                 if ((sc.nextInt()) == 1) {
                 t.setDatefin(datefin);
                 listerTaches();
                 }
                 else {
                 System.out.print("Opération annulée\n");
                }
                break;
            case 5:
                System.out.println("Entrer le nouvel etat de la tache");
                String etat= sc.nextLine();
                System.out.print("Voulez-vous enregistrer la modification?\t1 : OUI\t2 :"
                + " NON\n");
                vericationDeLaSaisie(1, 2);
                 if ((sc.nextInt()) == 1) {
                 t.setEtat(etat);
                 listerTaches();
                 }
                else {
                 System.out.print("Opération annulée\n");
                }
                break;
            case 6:
                mettreFinAuProgramme();
                break;
        }    
       
           
    }

 }
    public static void assignerTache(){
       //lister les taches
        listerTaches();
        // demander à l'user d'entrer le code de la tache à assigner
        System.out.println("Entrer le code de la tache à assigner");
                Integer intg= sc.nextInt();
                //verifier si tache existe
        Tache t = tacheIsExist(intg);
        //si elle existe alors 
        if(t!=null){
        //demander à user d'entrer le code du membre
        listerMembres();
        System.out.println("Entrer le code du membre auquel assigner la tache");
                Integer integ= sc.nextInt();
                Membre m = membreIsExist(integ);
        // si le mebre entré existe aussi alors faire l'assignation en enregistrant le idmembre dans idmemebre de la classe tache
                if(m!=null){
                listeTache.set(listeTache.indexOf(t), t);
                System.out.println("Opération réussie");
        }else 
            System.out.println("ce membre n'existe pas");
    } else 
            System.out.println("cette tache n'existe pas");
    }       
                   
    public static void reassignerTaches(){
          listerTaches();
        System.out.println("Entrer le code de la tache à réassigner");
                Integer intg= sc.nextInt();
        Tache t = tacheIsExist(intg);
        if(t!=null){
        listerMembres();
        System.out.println("Entrer le code du membre auquel réassigner la tache");
                Integer integ= sc.nextInt();
                Membre m = membreIsExist(integ);
                if(m!=null){
                listeTache.set(listeTache.indexOf(t), t);
                System.out.println("Opération réussie");
        }else 
            System.out.println("ce membre n'existe pas");
    } else 
            System.out.println("cette tache n'existe pas");
    }
                   
    public static void supprimerMembre(){
        
    }
}
