package prob1;
import emps.Employee;
public class Store {
	private Employee[] emps = new Employee[20];
	private int numEmps;
	
	public Store() {
		numEmps = 0;
	}

		
	
	public void addEmployee(Employee e) {
		if(numEmps<emps.length){
			emps[numEmps] = e;
			numEmps++;
		}
	}
	
	public int getNumEmployees() {
		return numEmps;	
				
	}
	
	public double getTotalHours() {
		double totalHours =0;
		for(int i = 0; i < numEmps; i++ )
			if(emps[i] != null)
				totalHours += emps[i].getTotalHours();
		return totalHours;
		}

	
	public Employee getEmployee(int i) {
		if(i>= 0 && i<numEmps) {
			return emps[i];
		}
		return null;
	}
		
	
	public Employee getEmployeeWithName(String findName){
		for(int i = 0; i < numEmps ; i++) {
		if(findName.equals(emps[i].getName())) {
		return emps[i];
	   }
	}
	return null;
	}
	
	public Employee removeEmployee(int i) {
		if(i >= 0 && i < numEmps) {
			Employee returnEmps = emps[i];
			for(int j = i + 1; j < numEmps; j++) {
				emps[j-1] = emps[i];
			}
			numEmps--;
			return returnEmps;
		}
		return null;
	}
	
	public double getTotalPay(){
		double totalPay =0;
		for(int i = 0; i < numEmps; i++) {
			totalPay += emps[i].getPay();
		}
		
		return totalPay;

	}
	
   public String toString() {
		
	String printString = "\n\n PayRoll Report\n\n" + "Num Employees: " + numEmps + "," +
				"total hrs: " + getTotalHours()+ "," + "total pay = " + getTotalPay()
				+ "\n";
		
		for(int i = 0; i<numEmps; i++) {
			printString += getEmployee(i) + "\n\n";
		}
				
		return printString;
	}
   }


 
