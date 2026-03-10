/*
 * ===============================================================
 * MAIN CLASS – UseCase5TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 *
 * At this stage, the application:
 * - Attaches bogies in order
 * - Preserves insertion sequence
 * - Avoids duplicate bogies
 * - Displays final train formation
 *
 * This maps ordered uniqueness using LinkedHashSet.
 *
 * @author Developer
 * @version 5.0
*/
package com.trainconsistmanagement;

import java.util.*;

public class TrainConsistMngmt {
	
	public static void main(String[] args) {
		System.out.println("=========================================");
		System.out.println("===UC5 - Preserve Insertion Order of Bogies===");
		System.out.println("=========================================\n\n");
		
		// Create a LinkedhashSet
        Set<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        
        // Trying to add duplicate
        formation.add("Engine");


        System.out.println("Final Train Formation:");
        System.out.println(formation + "\n");

        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.");
        

        System.out.println("\nUC5 formation setup completed...");
	}

}
