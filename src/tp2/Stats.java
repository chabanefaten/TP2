package tp2;

import java.util.ArrayList;


public class Stats {
    private ArrayList<Etudiant> groupe;

    public Stats(ArrayList<Etudiant> groupe) {
        this.groupe = groupe;}
    
	
	  public void afficherStatsEtudiants() {
	        for (Etudiant etudiant : groupe) {
	            System.out.println("Etudiant : " + etudiant.getNom());
	            System.out.println("Moyenne : " + etudiant.getValue());
	            System.out.println("la meilleure note : "+etudiant.getMaxNote());
	            System.out.println("Moins bonne note : " +etudiant.getMinNote()); 
	            System.out.println();
	        }
	    }
	  
	   public float getMoyenneGroupe() {
		  
	        float sum = 0;
	        for (Etudiant etudiant : groupe) {
	            sum += etudiant.getValue();
	        }
	        return sum / groupe.size();
	    }
	   
	   public void getMaximumGroupe() {
			Etudiant etudiantmeilleur=groupe.get(0);
			for(Etudiant etudiant : groupe) {
				if(etudiant.getValue()>etudiantmeilleur.getValue()) {
					etudiantmeilleur=etudiant;
				}

			}
			System.out.println("l'etudiant meilleur" +etudiantmeilleur.getNom());
			}
	   public void getMinimumGroupe() {
			Etudiant etudiantmoinsbon=groupe.get(0);
			for(Etudiant etudiant : groupe) {
				if(etudiant.getValue()<etudiantmoinsbon.getValue()) {
					etudiantmoinsbon=etudiant;
				}

			}
			System.out.println("l'etudiant mauvais"+etudiantmoinsbon.getNom());

			}
	        
		   
	   
	}

	 
