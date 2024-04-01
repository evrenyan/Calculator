class KalkulatorModel {
    private double resultat;

    public void leggTil(double tall1, double tall2) {
        resultat = tall1 + tall2;
    }
    public void trekkFra(double tall1, double tall2) {
        resultat = tall1 - tall2;
    }
    public void gange(double tall1, double tall2) {
        resultat = tall1 * tall2;
    }
    public void dele(double tall1, double tall2) {
        if (tall2 == 0) {
            throw new IllegalArgumentException("kan ikke dele 0");
        }
        resultat = tall1 / tall2;
    }
    public double hentResultat(){
        return resultat;
    }

}
