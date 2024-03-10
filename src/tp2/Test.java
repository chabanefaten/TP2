package tp2;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	    public static void main(String[] args) {
	      
	        Etudiant etudiant1 = new Etudiant("1", "faten",new ArrayList<>());
	        etudiant1.addNote( new Note("cours1",15.5));
	        etudiant1.addNote(new Note("math",17.0));
	        
	        Etudiant etudiant2 = new Etudiant("2", "rawen",new ArrayList<>());
	        etudiant2.addNote(new Note("math",12.0));
	        etudiant2.addNote(new Note("math",14.0));
	        
	        
	        ArrayList<Etudiant> groupeEtudiants = new ArrayList<>();
	        groupeEtudiants.add(etudiant1);
	        groupeEtudiants.add(etudiant2);

	     
	        Stats stats = new Stats(groupeEtudiants);
	        stats.afficherStatsEtudiants();
	        System.out.println("Moyenne du groupe : " + stats.getMoyenneGroupe());
	        System.out.println("Meilleur étudiant : " );
	        stats.getMaximumGroupe();
	        System.out.println("Moins bon étudiant : " );
	        stats.getMinimumGroupe();
	        Collections.sort(groupeEtudiants);
	        System.out.println("Liste d'étudiants triée par matricule : " + groupeEtudiants);


	        
	    }}       
	     


