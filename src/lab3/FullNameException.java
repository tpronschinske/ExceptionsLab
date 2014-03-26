/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

/**
 *
 * @author tpronschinske
 */
public class FullNameException extends IllegalArgumentException{
    private final String message = "Error, Please Enter A Valid Name";
    
    
    public FullNameException(){
        
    }
    
    public FullNameException(String message){
        super(message);
    }
    
     
    public FullNameException(String message, Throwable cause){
        super(message, cause);
    }
    
     
    public FullNameException(Throwable cause){
        super(cause);
    }
    
    
}
