package dk.ns.series;

    public class Saison extends Episode{
        private int num�roSaison;
        private int Ann�eSortie;

        public Saison(String titreEp, int num�roEp, int dur�eEp, int num�roSaison, int Ann�eSortie) {
            super(titreEp, num�roEp, dur�eEp);
            this.num�roSaison = num�roSaison;
            this.Ann�eSortie = Ann�eSortie;
        }
        public Saison(Episode episode, int num�roSaison, int Ann�eSortie) {
            super(episode.getTitreEp(), episode.getNum�roEp(), episode.getDur�eEp());
            this.num�roSaison = num�roSaison;
            this.Ann�eSortie = Ann�eSortie;
        }

        public int getNum�roSaison() {
            return num�roSaison;
        }

        public void setNum�roSaison(int num�ro) {
            this.num�roSaison = num�ro;
        }

        public int getAnn�eSortie() {
            return Ann�eSortie;
        }

        public void setAnn�eSortie(int ann�eSortie) {
            Ann�eSortie = ann�eSortie;
        }


        public String toString() {
            return super.toString() + "num�roSaison = " + num�roSaison + ", Ann�eSortie = " + Ann�eSortie + "";
        }




    }