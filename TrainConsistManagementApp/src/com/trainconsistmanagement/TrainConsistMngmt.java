/*
 * ================================================================
 * MAIN CLASS – TrainConsistMgmnt
 * ================================================================
 *
 * Use Case 6: Map Bogie to Capacity
 *
 * Description:
 * This class demonstrates how to associate bogie types
 * with their seating or load capacities using HashMap.
 *
 * At this stage, the application:
 * - Stores bogie types as keys
 * - Maps each bogie to its capacity
 * - Displays bogie-capacity details
 *
 * This maps key-value relationships using HashMap.
 *
 * @author Developer
 * @version 6.0
*/
package com.trainconsistmanagement;

import java.util.*;

public class TrainConsistMngmt {
	
	public static void main(String[] args) {
		System.out.println("=========================================");
		System.out.println("===UC6 - Map Bogie to Capacity (HashMap)===");
		System.out.println("=========================================\n\n");
		
		// Create a HashMap 
        Map<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 120);
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);

        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) 
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\n\nUC6 bogie-capacity mapping completed...");
	}

}
