package empwg;

public class welcome {
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation");
		uc emp = new uc();
		emp.checkEmployeePresentOrNot(1);
		emp.dailyWage(1);
		emp.switchCase(1);
		emp.Case5(1);
	    emp.case6(1);
	}
}

class uc {
	static void checkEmployeePresentOrNot(int is_fulltime) {
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (empCheck == is_fulltime) {
			System.out.println("employee is present");
		} else
			System.out.println("employee is absent");
	}

	static void dailyWage(int IS_FULL_TIME) {
		int ratePerHour = 20;
		int numberOfHoursWorked;
		int empwage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		{
			if (empCheck == IS_FULL_TIME)
				numberOfHoursWorked = 8;
			else
				numberOfHoursWorked = 0;
			empwage = numberOfHoursWorked * ratePerHour;
			System.out.println("dailywage: " + empwage);
		}
	}

	static void switchCase(int hours) {
		int ratePerHour = 20;
		int numberOfHoursWorked;
		int empwage = 0;
		final int IS_PART_TIME = 1;
		int emphrs = 0;
		final int IS_FULL_TIME = 2;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case IS_PART_TIME:
			emphrs = 4;
			break;
		case IS_FULL_TIME:
			emphrs = 8;
			break;
		default:
			emphrs = 0;
		}
		empwage = emphrs * ratePerHour;
		System.out.println("empwage:" + empwage);
	}
static void Case5(int hours) {
	int ratePerHour = 20;
	int numberOfHoursWorked;
	int empwage = 0;
	final int IS_PART_TIME = 1;
	int emphrs = 0;
	final int IS_FULL_TIME = 2;
	final int numOfWorkingDay=2;int totalempwage=0;
	for(int day = 0; day < numOfWorkingDay; day++) {
		int empCheck = (int) Math.floor(Math.random()*10) % 3;
		switch (empCheck) {
		case IS_PART_TIME:
			emphrs = 4;
			break;
		case IS_FULL_TIME:
			emphrs = 8;
			break;
		default:
			emphrs = 0;
		}
		empwage = emphrs * ratePerHour;
		totalempwage = empwage;
		System.out.println("empwage:" + empwage);
	}
}

static void case6(int hours)
{
	int ratePerHour = 20;int maxhours=100;
	int numberOfHoursWorked;
	int empwage = 0;
	final int IS_PART_TIME = 1;
	int emphrs = 0;
	final int IS_FULL_TIME = 2;
	final int numOfWorkingDay=20;int totalempwage=0;int totalemphrs = 0,totalworkingdays=0;
	while (totalemphrs <= maxhours && totalworkingdays < numOfWorkingDay) {
		totalworkingdays++;
		int empCheck = (int) Math.floor(Math.random()*10) % 3;
		switch (empCheck) {
		case IS_PART_TIME:
			emphrs=4;
			break;
		case IS_FULL_TIME:
			emphrs=8;
			break;
			default:
				emphrs=0;
		}
		totalemphrs += emphrs;
		System.out.println("day:" + totalworkingdays + "emphrs:" +emphrs);
		}
	totalempwage = totalemphrs * ratePerHour ;
		System.out.println("total emp wage:" + totalempwage);
}
		
}