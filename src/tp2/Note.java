package tp2;

public class Note {
	private String nomCours;
	private double note;
	public Note(String nomCours, double note) {
		this.nomCours = nomCours;
		this.note = note;
	}
	public String getNomCours() {
		return nomCours;
	}
	public void setNomCours(String nomCours) {
		this.nomCours = nomCours;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
	
	

}
