package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    public String extractLastName(String fullName) throws IllegalArgumentException {
        if(fullName == null|| fullName.length() < 1){
            throw new NullPointerException("Error, Name cant be null");
        }
        fullName = fullName.trim();
        String[] nameParts = fullName.split(" ");
        if(nameParts.length!= 2 ){
            throw new IllegalArgumentException("Error, First Name, Last Name EX(John Smith)");
        }
        return nameParts[nameParts.length - 1];
    }
    
    /**
     * Finds and returns the first name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     */
    public String extractFirstName(String fullName) throws IllegalArgumentException {
        if(fullName == null || fullName.length() < 1){
            throw new NullPointerException("Name Cannot be Null, Name cant be less than one");
        }
        fullName = fullName.trim();
        String[] nameParts = fullName.split(" ");
        if(nameParts.length != 2){
            throw new IllegalArgumentException("Error, First Name, Last Name EX (John Smith)");
        }
        return nameParts[FIRST_NAME_IDX];
    }

    /**
     * Gets the length of a name.
     * 
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public int getNameLength(String name) {
        return name.length();
    }
    
}
