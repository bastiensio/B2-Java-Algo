package dk.ns.series;


	public class Episode {
	    private String titreEp;
	    private int num�roEp;
	    private int dur�eEp;

	    public Episode(String titreEp, int num�roEp, int dur�eEp) {
	        this.titreEp =  titreEp;
	        this.num�roEp = num�roEp;
	        this.dur�eEp = dur�eEp;
	    }

	    public String getTitreEp() {
	        return titreEp;
	    }

	    public void setTitreEp(String titreEp) {
	        this.titreEp = titreEp;
	    }

	    public int getNum�roEp() {
	        return num�roEp;
	    }

	    public void setNum�roEp(int num�roEp) {
	        this.num�roEp = num�roEp;
	    }

	    public int getDur�eEp() {
	        return dur�eEp;
	    }

	    public void setDur�eEp(int dur�e) {
	        this.dur�eEp = dur�e;
	    }


	    public String toString() {
	        return "titreEp = " + titreEp + ", num�roEp = " + num�roEp + ", dur�e = " + dur�eEp + "";
	    }


}
