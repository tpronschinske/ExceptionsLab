/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab0;



/**
 *
 * @author tpronschinske
 */
public class EmployeeHireDateException extends RuntimeException{
    
    private String msg;
    
    public EmployeeHireDateException(){
        
    }
    
    public EmployeeHireDateException(String msg){
        super(msg);
    }
    
    public EmployeeHireDateException(String msg, Throwable cause){
        super(msg, cause);
        
    }
    
    
}
