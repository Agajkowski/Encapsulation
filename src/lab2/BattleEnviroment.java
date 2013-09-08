/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author alex
 */
public final class BattleEnviroment {
    
    private int pokemonCountForBattle;
    private String enviroment;
    private int weather;

    public BattleEnviroment() {
	setBattlefield();
    }

    private void setBattlefield(){
	setPokemonCountForBattle();
	setEnviroment();
	setWeather();
    }
    
    private void setPokemonCountForBattle() {
	//pokemonCountForBattle = Use a math.ran fuction to pick a number 1-3 round up.
	
    }

    private void setEnviroment() {
	//enviorment = use a math.ran to decide on the battlefield type as an enum most likely... 
	//would require some extra thought but for the sake of this assignment this should be okay?
	 
    }
    private void setWeather() {
	//weather = use a math.ran to choose 1-4 none,sunny,rain,snow.
    }
    
}
