import java.util.*;


public class MyHashTable {
	
	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo object.
	private ArrayList<EmployeeInfo>[] buckets;
	private int bucketCount;
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.
		bucketCount = howManyBuckets;
		// Instantiate an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[bucketCount];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < bucketCount; i++) {
			buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
		}
	}

	
	// METHODS

	public int calcBucket(int keyValue) {
		// Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
		return(keyValue % buckets.length);
	}
	

	
	public void addEmployee(EmployeeInfo theEmployee) {
		// Add the employee to the hash table.  Return true if employee is added successfully,
		// return false otherwise.
		int empPlace = theEmployee.getEmpNumber() % bucketCount;
		buckets[empPlace].add(theEmployee);
		
	}

	
	
	public int searchByEmployeeNumber(int employeeNum) {
		// Determine the position of the employee in the ArrayList for the bucket that employee hashes to.
		// If the employee is not found, return -1.
	}

	
	
	public void removeEmployee(EmployeeInfo theEmployee) {
		// Remove the employee from the hash table
		int empPlace = theEmployee.getEmpNumber() % bucketCount;
		for (int i = 0; i < buckets[empPlace].size() - 1; i++) {

			if (buckets[empPlace].get(i).getEmpNumber() == theEmployee.getEmpNumber()) {
				buckets[empPlace].remove(i);
			}
		}
	}

	
	
	public void displayContents() {
		
		// Print the employee numbers for the employees stored in each bucket's ArrayList,
		// starting with bucket 0, then bucket 1, and so on.
		
		for (int i = 0; i < buckets.length; i++) {

		    // For the current bucket, print out the emp num for each item
                    // in its ArrayList.

                    System.out.println("\nExamining the ArrayList for bucket " + i);
                    int listSize = buckets[i].size();
                    if (listSize == 0) {
		        System.out.println("  Nothing in its ArrayList!");
                    }
                    else {
                        for (int j = 0; j < listSize; j++) {
                           int empNum = buckets[i].get(j).getEmpNumber();
                           System.out.println("  Employee " + empNum);
                        }
                    }

                }

	} // end displayContents


	
} // end class MyHashTable
