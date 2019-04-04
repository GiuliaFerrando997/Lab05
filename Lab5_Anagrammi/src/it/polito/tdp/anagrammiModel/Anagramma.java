package it.polito.tdp.anagrammiModel;

import java.util.*;

public class Anagramma {
	
	//private int numeroPossibilita;
	private List<String> anagrammi;
	private String iniziale;
	private Map<Character, Integer> spell=new HashMap<>();
	
	public Anagramma(String parola) {
		super();
		this.iniziale=parola;
		//this.numeroPossibilita=factorial(parola.length());
		this.anagrammi=new ArrayList<>();
		if(parola==null)
			this.spell.put(null, 0);
		else
			this.spell.putAll(this.spelling());
	}


	public int factorial(int n) 
	{ 
	    if (n == 0) 
	        return 1;  // calcolo diretto di 0! 
	    else  
	    {   int result = n * factorial(n - 1); 
	        return result; 
	    } 
	}
	
	public Map<Character, Integer> spelling(){
		char c = 'a';
		Map<Character, Integer> spell = new HashMap<>();
		for(int i=0; i<iniziale.length(); i++) {
			c=iniziale.charAt(i);
			if(spell.containsKey(c)) {
				spell.put(c, spell.get(c)+1);
			}
			else
				spell.put(c, 1);	
		}
		
		return spell;
		
	}


	//public int getNumeroPossibilita() {
		//return numeroPossibilita;
	//}


	//public void setNumeroPossibilita(int numeroPossibilita) {
		//this.numeroPossibilita = numeroPossibilita;
	//}


	public String getIniziale() {
		return iniziale;
	}


	public void setIniziale(char c) {
		if(iniziale!=null)
			this.iniziale=this.iniziale+c;
		else
			iniziale=c+"";
	}


	public Map<Character, Integer> getSpell() {
		return spell;
	}


	public void setSpell(char c) {
		if(spell==null || !spell.containsKey(c)) {
			this.spell.put(c, 1);
		}
		else
			this.spell.put(c, getSpell(c)+1);
	}


	public void togliLettera(char c) {
		this.iniziale = this.iniziale.substring(0, iniziale.length()-1);
		
	}


	public void togliSpell(char c) {
		if(spell.containsKey(c))
			this.spell.put(c, spell.get(c)-1);
		else
			this.spell.remove(c);
		
	}


	public List<String> getAnagrammi() {
		return anagrammi;
	}


	public int getSpell(char c) {
		if(this.spell.containsKey(c))
			return this.spell.get(c);
		else 
			return 0;
	}




	
	
	
	
	
	

}
