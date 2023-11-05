package dk.ns.series;

    public class Saison extends Episode{
        private int numéroSaison;
        private int AnnéeSortie;

        public Saison(String titreEp, int numéroEp, int duréeEp, int numéroSaison, int AnnéeSortie) {
            super(titreEp, numéroEp, duréeEp);
            this.numéroSaison = numéroSaison;
            this.AnnéeSortie = AnnéeSortie;
        }
        public Saison(Episode episode, int numéroSaison, int AnnéeSortie) {
            super(episode.getTitreEp(), episode.getNuméroEp(), episode.getDuréeEp());
            this.numéroSaison = numéroSaison;
            this.AnnéeSortie = AnnéeSortie;
        }

        public int getNuméroSaison() {
            return numéroSaison;
        }

        public void setNuméroSaison(int numéro) {
            this.numéroSaison = numéro;
        }

        public int getAnnéeSortie() {
            return AnnéeSortie;
        }

        public void setAnnéeSortie(int annéeSortie) {
            AnnéeSortie = annéeSortie;
        }


        public String toString() {
            return super.toString() + "numéroSaison = " + numéroSaison + ", AnnéeSortie = " + AnnéeSortie + "";
        }




    }