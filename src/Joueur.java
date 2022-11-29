public class Joueur {
    
    String nom;
    String prenom;
    DeAJouer[] tabDeDes;


    public Joueur(String nom, String prenom, DeAJouer[] tabDeDes) {
        this.nom = nom;
        this.prenom = prenom;
        this.tabDeDes = tabDeDes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public DeAJouer[] getTabDeDes() {
        return tabDeDes;
    }

    public void setTabDeDes(DeAJouer[] tabDeDes) {
        this.tabDeDes = tabDeDes;
    }
    
    public void lancer(){
        for (DeAJouer tabDeDe : tabDeDes) {
            tabDeDe.lancerLeDe();
            //ajouter afficher valeur : changer le return String
        }
    }
    
    public int score(){
        int score = 0;
        for (DeAJouer tabDeDe : tabDeDes) {
            int res = tabDeDe.getValeur();
            score+= res;
        }
        return score;
    }
    
    public int max(){
        int temp = 0;
        for (DeAJouer tabDeDe : tabDeDes) {
            if(tabDeDe.getValeur() > temp){
                temp = tabDeDe.getValeur();
            }
        }
        return temp;
    }

    public int min(){
        int temp = 6;
        for (DeAJouer tabDeDe : tabDeDes) {
            if(tabDeDe.getValeur() < temp)
                temp = tabDeDe.getValeur();
        }
        return temp;
    }


}
