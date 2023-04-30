import java.util.Random;

public class EmployeeWageComputation2 {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        
        //UC1: Calculate Daily Employee Wage
        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage = wagePerHour * fullDayHour;
        System.out.println("Daily Employee Wage: " + dailyWage);
        
        //UC2: Add Part-time Employee & Wage
        int partTimeHour = 4;
        int partTimeWage = wagePerHour * partTimeHour;
        System.out.println("Part-time Employee Wage: " + partTimeWage);
        
        //UC3: Solving using Switch Case Statement
        int empType = new Random().nextInt(2);
        int empWage = 0;
        switch(empType) {
            case 0:
                empWage = dailyWage;
                System.out.println("Employee is Full-time");
                break;
            case 1:
                empWage = partTimeWage;
                System.out.println("Employee is Part-time");
                break;
            default:
                System.out.println("Invalid employee type");
        }
        System.out.println("Employee Wage: " + empWage);
        
        //UC4: Calculating Wages for a Month
        int workingDaysPerMonth = 20;
        int monthlyWage = empWage * workingDaysPerMonth;
        System.out.println("Monthly Employee Wage: " + monthlyWage);
        
        //UC5: Calculate Wages till a condition of total working hours or days is reached for a month
        int workingHoursPerMonth = 100;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        int monthlyWageWithCondition = 0;
        while(totalWorkingHours < workingHoursPerMonth && totalWorkingDays < workingDaysPerMonth) {
            empType = new Random().nextInt(2);
            switch(empType) {
                case 0:
                    totalWorkingHours += fullDayHour;
                    monthlyWageWithCondition += dailyWage;
                    break;
                case 1:
                    totalWorkingHours += partTimeHour;
                    monthlyWageWithCondition += partTimeWage;
                    break;
            }
            totalWorkingDays++;
        }
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Monthly Employee Wage with Condition: " + monthlyWageWithCondition);
        
        //UC6: Storing Daily Wage along with the Total Wage
        int[] dailyWages = new int[workingDaysPerMonth];
        int totalWage = 0;
        for(int i=0; i<workingDaysPerMonth; i++) {
            empType = new Random().nextInt(2);
            switch(empType) {
                case 0:
                    dailyWages[i] = dailyWage;
                    break;
                case 1:
                    dailyWages[i] = partTimeWage;
                    break;
            }
            totalWage += dailyWages[i];
        }
        System.out.println("Total Wage: " + totalWage);
        System.out.println("Daily Wages: ");
        for(int i=0; i<workingDaysPerMonth; i++) {
            System.out.println("Day " + (i+1) + ": " + dailyWages[i]);
        }
    }

}
