/*
 * ===============================================================
 * MAIN CLASS – UseCase4TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 *
 * At this stage, the application:
 * - Adds bogies in sequence
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays updated train structure
 *
 * This maps positional operations using LinkedList.
 *
 * @author Developer
 * @version 4.0
*/
package com.trainconsistmanagement;

import java.util.*;

public class TrainConsistMngmt {
	
	public static void main(String[] args) {
		System.out.println("=========================================");
		System.out.println("===UC4 - Track Unique Bogie IDs===");
		System.out.println("=========================================\n\n");
		
		// Create a LinkedList
        List<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");


        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist + "\n");

        trainConsist.add(2, "Pantry Car");
        System.out.println("After inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist + "\n");
        
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After removing First and Last Bogie:");
        System.out.println(trainConsist);
        

        System.out.println("\nUC4 order consist operations completed...");
	}

}
