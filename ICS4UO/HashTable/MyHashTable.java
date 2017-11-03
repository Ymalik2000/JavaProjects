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

	public int bucketLocation(int keyValue) {
		// Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
		return(keyValue % buckets.length);
	}
	

	
	public void addEmployee(EmployeeInfo theEmployee) {
		// Add the employee to the hash table.
		int empPlace = theEmployee.getEmpNumber() % bucketCount;
		int empNum = theEmployee.getEmpNumber();
		buckets[empPlace].add(theEmployee);
		System.out.println("\nEmployee " + empNum + " has been added.");
	}

	
	
	public void searchByEmployeeNumber(int employeeNum) {
		// Determine the position of the employee in the ArrayList for the bucket that employee hashes to.
		int empPlace = employeeNum % bucketCount;
		boolean existCheck = false;
		for (int i = 0; i < buckets[empPlace].size(); i++) {
			if (buckets[empPlace].get(i).getEmpNumber() == employeeNum) {
				System.out.println("\nEmployee " + employeeNum + " is in bucket " + empPlace + " and is in position "
						+ i);
				existCheck = true;
			}
		}
		if (existCheck == false) {
			System.out.println("\nEmployee " + employeeNum + " is not in the Hash Table.");
		}
	}

	
	
	public void removeEmployee(EmployeeInfo theEmployee) {
		// Remove the employee from the hash table
		int empPlace = theEmployee.getEmpNumber() % bucketCount;
		int empNum = theEmployee.getEmpNumber();
		for (int i = 0; i < buckets[empPlace].size(); i++) {

			if (buckets[empPlace].get(i).getEmpNumber() == theEmployee.getEmpNumber()) {
				buckets[empPlace].remove(i);
				System.out.println("\nEmployee " + empNum + " has been removed.");
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