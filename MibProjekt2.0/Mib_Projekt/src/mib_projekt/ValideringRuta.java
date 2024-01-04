/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package mib_projekt;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author oscarmolin
 */
public class ValideringRuta {
    //Fristående klass som skall validera/kontrollera användarinmatning.
    
    //Metod som gör detta. 
    public static boolean finnsVarde(JTextField ettVarde)
    {
        boolean finns= true; 
        if(ettVarde.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Fyll i nödvändiga fält som saknar värde");
            finns = false; 
        }
        return finns; 
    }  
        
    
            
 

    
    
    
    
    
}


