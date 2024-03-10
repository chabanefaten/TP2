package tp2;

import java.util.ArrayList;

public class Etudiant implements IStatisticable,Comparable<Etudiant>{
	private String mat;
	private String nom;
	ArrayList <Note> Notes;
	
	public void  addNote(Note d) {
		Notes.add(d);
	}
	public String getMat() {
		return mat;
	}
	
	public void setMat(String mat) {
		this.mat = mat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public ArrayList<Note> getNotes() {
		return Notes;
	}
	public void setNotes(ArrayList<Note> notes) {
		Notes = notes;
	}
	public Etudiant(String mat, String nom, ArrayList<Note> l) {
		this.mat = mat;
		this.nom = nom;
		this.Notes = new ArrayList<>();

	}
	
	@Override
	public String toString() {
		return "Etudiant [mat=" + mat + ", nom=" + nom + ", Notes=" + Notes + "]";
	}
	public float getValue() {
	  
	    double sum = 0;
	    for (Note note : Notes) {
	        sum += note.getNote();
	    }
	    return (float) (sum / Notes.size());
	}
	public double getMinNote() {
		double min=this.Notes.get(0).getNote();
		for (int i=1;i<Notes.size();i++)
		{
			if (min<this.Notes.get(i).getNote())
					{
				         min=this.Notes.get(i).getNote(); 
					}
		}
		return min;
		
		
	
	}
	public double getMaxNote() {
		double max=this.Notes.get(0).getNote();
		for (int i=1;i<Notes.size();i++)
		{
			if (max>this.Notes.get(i).getNote())
					{
				         max=this.Notes.get(i).getNote(); 
					}
		}
		return max;
	}
	 public int compareTo(Etudiant autreEtudiant) {
		 if(autreEtudiant.getValue()>this.getValue()) {
			 return 1;
		 }
		 else if(autreEtudiant.getValue()<this.getValue()) {
			 return -1;
		 }
		 else
		 return 0;
	        
	    }
	
	 
	
	
	

}
