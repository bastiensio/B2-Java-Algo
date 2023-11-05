package dk.ns.series;


	public class Episode {
	    private String titreEp;
	    private int numéroEp;
	    private int duréeEp;

	    public Episode(String titreEp, int numéroEp, int duréeEp) {
	        this.titreEp =  titreEp;
	        this.numéroEp = numéroEp;
	        this.duréeEp = duréeEp;
	    }

	    public String getTitreEp() {
	        return titreEp;
	    }

	    public void setTitreEp(String titreEp) {
	        this.titreEp = titreEp;
	    }

	    public int getNuméroEp() {
	        return numéroEp;
	    }

	    public void setNuméroEp(int numéroEp) {
	        this.numéroEp = numéroEp;
	    }

	    public int getDuréeEp() {
	        return duréeEp;
	    }

	    public void setDuréeEp(int durée) {
	        this.duréeEp = durée;
	    }


	    public String toString() {
	        return "titreEp = " + titreEp + ", numéroEp = " + numéroEp + ", durée = " + duréeEp + "";
	    }


}
