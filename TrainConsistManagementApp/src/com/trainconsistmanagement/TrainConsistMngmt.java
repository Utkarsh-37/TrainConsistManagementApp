/*
 * ===============================================================
 * MAIN CLASS – UseCase2TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 *
 * At this stage, the application:
 * - Adds new bogies to the train
 * - Removes existing bogies
 * - Checks for bogie availability
 * - Displays the final consist
 *
 * This maps CRUD operations using ArrayList.
 *
 * @author Developer
 * @version 2.0
*/
package com.trainconsistmanagement;

import java.util.*;

public class TrainConsistMngmt {
	
	public static void main(String[] args) {
		System.out.println("=========================================");
		System.out.println("===UC2 - Add Passenger Boogies to train===");
		System.out.println("=========================================\n\n");
		
		List<String> trainConsist = new ArrayList<>();
		int bogieCount = 0;
		
		trainConsist.add("Sleeper");
		trainConsist.add("AC Chair");
		trainConsist.add("First Class");
		
		System.out.println("After adding Bogies: ");
		System.out.println(trainConsist);
		
		trainConsist.remove("AC Chair");
		
		System.out.println("\nAfter removing AC Chair:");
		System.out.println(trainConsist);
		
		System.out.println("\nChecking if Sleeper exists: ");
		System.out.println("Contains Sleeper? : " + trainConsist.contains("Sleeper"));
		
		System.out.println("\nFinal Train Passenger Consist: ");
		System.out.println(trainConsist);
		
		System.out.println("\nUC2 operations completed successfully...");
	}

}
