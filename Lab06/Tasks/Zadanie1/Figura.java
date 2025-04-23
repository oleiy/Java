package Tasks.Zadanie1;

public class Figura {
	
	//pola metody i kontruktory
	public Punkt punkt;
	public String kolor = "bialy";


	public Figura(){
		punkt = new Punkt(0,0);
	}
	public Figura(String kolor){
		this.kolor=kolor;
	}
	public Figura(Punkt punkt){
		this.punkt=punkt;
	}
	public String getKolor(){
		return kolor;
	}
	public String opis(){
		return "Klasa Tasks.Zadanie1.Figura. Kolor obiektu: "+kolor;
	}
			
	
}
