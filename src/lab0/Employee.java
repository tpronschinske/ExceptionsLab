package lab0;

import java.util.Calendar;
import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation) {
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    // cant be null, cant be empty, any charactor or number between 0-25
    public final void setFirstName(String firstName) throws IllegalArgumentException  {
       if(firstName == null || firstName.length() < 1 || firstName.length() > 25){
           throw new IllegalArgumentException();
       }
        this.firstName = firstName;
    }
 
    public Date getHireDate() {
        return hireDate;
    }
    // cant be null, cant be earlier than 14 days from today and cant be later than 5 days from today
    
    public void setHireDate(Date hireDate) throws EmployeeHireDateException {
        if(hireDate == null){
            throw new EmployeeHireDateException("Hire Date Cant Be Null");
        }
        Calendar calHireDate = Calendar.getInstance();
        calHireDate.setTime(hireDate);
        
        Calendar beforeHireDate = Calendar.getInstance();
        beforeHireDate.add(Calendar.DATE, -5);
        
        Calendar afterHireDate = Calendar.getInstance();
        afterHireDate.add(Calendar.DATE, 14);
        
        if(calHireDate.before(beforeHireDate)|| calHireDate.after(afterHireDate)){
            throw new EmployeeHireDateException("Can not be more than 14 days from the current date and 5 days before the current date");
        }        
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    // 333-33-3333
    // 333333333
    public void setSsn(String ssn) {
        ssn = ssn.replaceAll("-", "");
        char[] chars = ssn.toCharArray();
        for(char c : chars){
            if(!Character.isDigit(c)){
                throw new IllegalArgumentException("Sorry SSN must be 9 characters in length and be numeric");
            }
        }
        this.ssn = ssn;
    }
    
    
    
}
