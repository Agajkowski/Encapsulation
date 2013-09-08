/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author alex
 */
public abstract class Pokemon {
    
    private String name;
    private int baseHealthPoints;
    private int attackValue;
    private int defenseValue;

    public Pokemon(String name, int baseHealthPoints, int attackValue, int defenseValue) {
	this.name = name;
	this.baseHealthPoints = baseHealthPoints;
	this.attackValue = attackValue;
	this.defenseValue = defenseValue;
    }
    
}
