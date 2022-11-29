public class DeAJouer {
    int valeur;
    int[] nbFaces;

    int nbDesCrees = 0;

    public DeAJouer() {
        this.valeur = 1;
        this.nbFaces = new int[6];
        this.nbDesCrees+=1;
    }

    public DeAJouer(int valeur, int[] nbFaces) {
        this.valeur = valeur;
        this.nbFaces = nbFaces;
        this.nbDesCrees+=1;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public int[] getNbFaces() {
        return nbFaces;
    }

    public void setNbFaces(int[] nbFaces) {
        this.nbFaces = nbFaces;
    }

    public void lancerLeDe(){
        this.valeur = (int)(Math.random()*6+1);
    }

    public void afficherValeur(){
        System.out.println(this.valeur);
    }
}
