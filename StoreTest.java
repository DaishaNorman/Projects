package prob1;

import emps.Employee;

public class StoreTest {

	public static void main(String[] args) {
		testAddEmp_Add_1();

		testAddEmp_Add_3();
		testAddEmp_Add_20();
        testAddEmp_Add_21();
        testGetEmp_5_Emps_Loc_Minus_2();
		testGetEmp_5_Emps_Loc_0();

        testGetEmp_5_Emps_Loc_2();
		testGetEmp_5_Emps_Loc_4();
		testGetEmp_5_Emps_Loc_5();

		testGetTotalHours_3_Employees();

		
          testGetTotalPay_3_Employees();
          testRemoveEmployee_With_5_Employees_Loc_Minus_2();
          testRemoveEmployee_With_5_Employees_Loc_0();

           testRemoveEmployee_With_5_Employees_Loc_2();

	
         testRemoveEmployee_With_5_Employees_Loc_4();

		testRemoveEmployee_With_5_Employees_Loc_5();


       testRemoveEmployee_With_20_Employees_Loc_19();
       testGetEmployeeWithName_Found();

		testGetEmployeeWithName_NotFound();
		
		System.out.println("\n-->createStoreWith3Employees");

		Store p = createStoreWith3Employees();
		System.out.println("\n-->createStoreWith5Employees");
	//p.toString();

		createStoreWith5Employees();		
		System.out.println("\n-->createStoreWith20Employees");

		createStoreWith20Employees();

          testToString();

	}
		
	
	public static void testAddEmp_Add_1() {
		System.out.println("-->testAddEmp_Add_1"); 
        Store store = new Store();
		
		Employee e = new Employee("Alan", 10.0);
		
		store.addEmployee(e);
		
		System.out.println("expected: 1");
		System.out.println("Actual: " + store.getNumEmployees());  
	}
	
	public static void testAddEmp_Add_3() {
		System.out.println("\n-->testAddEmp_Add_3"); 
        Store store = new Store();
		
		Employee e = new Employee("Daisha", 1.0);
		Employee e1 = new Employee("Josh", 2.0);
		Employee e2 = new Employee("Bria", 3.0);
		
		store.addEmployee(e);
		store.addEmployee(e1);
		store.addEmployee(e2);
		
		
		System.out.println("Expected: 3");
		System.out.println("Actual: " + store.getNumEmployees());  
	}
	
	public static void testAddEmp_Add_20() {
		System.out.println("\n-->testAddEmp_Add_20"); 
		Store e = createStoreWith20Employees();

		System.out.println("Expected: 20");
		System.out.println("Actual: " + e.getNumEmployees());
	}

	public static void testAddEmp_Add_21() {
		System.out.println("\n-->testAddEmp_Add_21_Emps"); 
		Store e = createStoreWith20Employees();
		Employee e1 = new Employee("Bob",40.0);
		e.addEmployee(e1);

		System.out.println("Expected: 21");
		System.out.println("Actual: " + e.getNumEmployees());
		
	}

	public static void testGetEmp_5_Emps_Loc_Minus_2() {
		System.out.println("\n-->testGetEmp_5_Emps_Loc_Minus_2"); 
        Store e = createStoreWith5Employees();
		
		System.out.println("Expect: Null");
		System.out.println("Actual: " + e.getEmployee(-2)); 
	}
	
	public static void testGetEmp_5_Emps_Loc_0() {
		System.out.println("\n-->testGetEmp_5_Emps_Loc_0"); 
        Store e = createStoreWith5Employees();
		
		System.out.println("Expect: Amanda");
		System.out.println("Actual: " + e.getEmployee(0)); 
	}

	public static void testGetEmp_5_Emps_Loc_2() {
		System.out.println("\n-->testGetEmp_5_Emps_Loc_2"); 
        Store e = createStoreWith5Employees();
		
		System.out.println("Expect: Lexi");
		System.out.println("Actual: " + e.getEmployee(2));  
	}

	public static void testGetEmp_5_Emps_Loc_4() {
		System.out.println("\n-->testGetEmp_5_Emps_Loc_4"); 
        Store e = createStoreWith5Employees();
		
		System.out.println("Expect: Steven");
		System.out.println("Actual: " + e.getEmployee(4)); 
	}

	public static void testGetEmp_5_Emps_Loc_5() {
		System.out.println("\n-->testGetEmp_5_Emps_Loc_5"); 
        Store e = createStoreWith5Employees();
		
		System.out.println("Expect: null");
		System.out.println("Actual: " + e.getEmployee(5));
	}

	public static void testGetTotalHours_3_Employees() {
		System.out.println("\n-->testGetTotalHours_3_Employees"); 
        Store store = createStoreWith3Employees();
		
		System.out.println("Expected: 100.0");
		System.out.println("Actual: " + store.getTotalHours());
	}
	
	public static void testGetTotalPay_3_Employees() {
		System.out.println("\n-->testGetTotalPay_3_Employees"); 
		Store store = new Store();
		double[] hours = {1,0,0,0,0,0,0};
		Employee e1 = new Employee("Amanda", 10.0);
		for(int x = 0; x < hours.length; x++) {
			e1.setHours(x, hours[x]);
		}
		store.addEmployee(e1);
		
		double[] hours2 = {1,0,0,0,0,0,0};
		Employee e2 = new Employee("Jorge", 10.0);
		for(int x = 0; x < hours2.length; x++) {
			e2.setHours(x, hours2[x]);
		}
		store.addEmployee(e2);

		double[] hours3 = {1,0,0,0,0,0,0};
		Employee e3 = new Employee("Lexi", 20.0);
		for(int x = 0; x < hours3.length; x++) {
			e3.setHours(x, hours3[x]);
		}
		store.addEmployee(e3);
		
		System.out.println("Expected: 40.0"); 
		System.out.println("Actual: " + store.getTotalPay());
	}
	
	public static void testRemoveEmployee_With_5_Employees_Loc_Minus_2() {
		System.out.println("\n-->testRemoveEmployee_With_5_Employees_Loc_Minus_2");
		Store e = createStoreWith5Employees();
		System.out.println("Expected: null");
		System.out.println("Actual: " + e.removeEmployee(-2));
	}
	
	public static void testRemoveEmployee_With_5_Employees_Loc_0() {
		System.out.println("\n-->testRemoveEmployee_With_5_Employees_Loc_0");
		Store e = createStoreWith5Employees();
		System.out.println("Expected: Amanda");
		System.out.println("Actual: " + e.removeEmployee(0));
	}

	public static void testRemoveEmployee_With_5_Employees_Loc_2() {
		System.out.println("\n-->testRemoveEmployee_With_5_Employees_Loc_2");
		Store e = createStoreWith5Employees();
		System.out.println("Expected: Lexi");
		System.out.println("Actual: " +  e.removeEmployee(2));
		
	}

	public static void testRemoveEmployee_With_5_Employees_Loc_4() {
		System.out.println("\n-->testRemoveEmployee_With_5_Employees_Loc_4");
		Store e = createStoreWith5Employees();
		System.out.println("Expected: Steven");
		System.out.println("Actual: " +  e.removeEmployee(4));
	}

	public static void testRemoveEmployee_With_5_Employees_Loc_5() {
		System.out.println("\n-->testRemoveEmployee_With_5_Employees_Loc_5");
		Store e = createStoreWith5Employees();
		System.out.println("Expected: null");
		System.out.println("Actual: " + e.removeEmployee(5));
	}

	public static void testRemoveEmployee_With_20_Employees_Loc_19() {
		System.out.println("\n-->testRemoveEmployee_With_20_Employees_Loc_19");
		Store e = createStoreWith20Employees();
		System.out.println("Expected: Tyrone");
		System.out.println("Actual: " + e.removeEmployee(19));
	}

	public static void testGetEmployeeWithName_Found() {
		System.out.println("\n-->testGetEmployeeWithName_Found");
		Store e = createStoreWith5Employees();
		System.out.println("Expected: Lexi");
		System.out.println("Actual: " + e.getEmployeeWithName("Lexi"));
	}

	public static void testGetEmployeeWithName_NotFound() {
		System.out.println("\n-->testGetEmployeeWithName_NotFound");
		Store e = createStoreWith5Employees();
		System.out.println("Expected: Null");
		System.out.println("Actual: " + e.getEmployeeWithName(" "));
	}

	public static void testToString() {
		System.out.println("\n-->testToString");
		Store e = createStoreWith20Employees();
		System.out.println(e.toString()); 
	}

	
	public static Store createStoreWith3Employees() {
		Store store = new Store();
		double[] hours = {8,8,8,8,8,0,0};
		Employee e1 = new Employee("Amanda", 10.0);
		for(int x = 0; x < hours.length; x++) {
			e1.setHours(x, hours[x]);
		}
		store.addEmployee(e1);
		
		double[] hours2 = {0,0,8,8,8,8,8};
		Employee e2 = new Employee("Jorge", 10.0);
		for(int x = 0; x < hours2.length; x++) {
			e2.setHours(x, hours2[x]);
		}
		store.addEmployee(e2);

		double[] hours3 = {5,5,0,5,0,5,0};
		Employee e3 = new Employee("Lexi", 20.0);
		for(int x = 0; x < hours3.length; x++) {
			e3.setHours(x, hours3[x]);
		}
		store.addEmployee(e3);
		System.out.println(store.toString());
		return store;
	}


	public static Store createStoreWith5Employees() {
		Store store = createStoreWith3Employees();
		//Store store = new Store();

		
		double[] hours = {8,8,8,8,8,0,0};
		Employee e1 = new Employee("Ben", 10.0);
		for(int x = 0; x < hours.length; x++) {
			e1.setHours(x, hours[x]);
		}
		store.addEmployee(e1);
		
		double[] hours2 = {10,10,10,10,10,8,8};
		Employee e2 = new Employee("Steven", 10.0);
		for(int x = 0; x < hours2.length; x++) {
			e2.setHours(x, hours2[x]);
		}
		store.addEmployee(e2);
		System.out.println(store.toString());

		return store;
	}

	
	public static Store createStoreWith20Employees() {
		Store store = new Store();
		store.addEmployee(createTestEmployee("Amanda", 10.0));
		store.addEmployee(createTestEmployee("Bill", 10.0));
		store.addEmployee(createTestEmployee("Christina", 10.0));
		store.addEmployee(createTestEmployee("David", 10.0));
		store.addEmployee(createTestEmployee("Edith", 10.0));
		store.addEmployee(createTestEmployee("Fernando", 10.0));
		store.addEmployee(createTestEmployee("Genesis", 10.0));
		store.addEmployee(createTestEmployee("Harry", 10.0));
		store.addEmployee(createTestEmployee("Irene", 10.0));
		store.addEmployee(createTestEmployee("Jason", 10.0));
		store.addEmployee(createTestEmployee("Kelly", 10.0));
		store.addEmployee(createTestEmployee("Louis", 10.0));
		store.addEmployee(createTestEmployee("Maria", 10.0));
		store.addEmployee(createTestEmployee("Newton", 10.0));
		store.addEmployee(createTestEmployee("Olivia", 10.0));
		store.addEmployee(createTestEmployee("Perry", 10.0));
		store.addEmployee(createTestEmployee("Quistis", 10.0));
		store.addEmployee(createTestEmployee("Randal", 10.0));
		store.addEmployee(createTestEmployee("Sarah", 10.0));
		store.addEmployee(createTestEmployee("Tyrone", 10.0));
		System.out.println(store.toString());

		return store;
	}

	private static Employee createTestEmployee(String name, double rate) {
		Employee e1 = new Employee(name, rate);
		for(int x = 0; x < 5; x++) {
			e1.setHours(x, 5);
		}
		return e1;
	}
}// end of class
