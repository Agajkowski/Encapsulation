/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author alex
 */
public class GUI {
    private boolean attackButton = false;
    private boolean bagButton = false;
    private boolean runButton = false;
    
    private boolean attackButtonPressed(){
	return attackButton = true;
}
    
    private boolean bagButtonPressed(){
	return bagButton = true;
    }
    
    private boolean runButtonPressed(){
	return runButton = true;
    }
}
