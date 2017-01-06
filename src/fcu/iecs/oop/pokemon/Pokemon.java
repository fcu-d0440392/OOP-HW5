package fcu.iecs.oop.pokemon;

public class Pokemon {

	private String name;

	private int Cp;

	public Pokemon(String name, int cp) {
		this.name = name;
		this.Cp = cp;
	}

	public String getName() {
		return this.name;
	}

	public int getCp() {
		return this.Cp;
	}

	public void SetCp(int cp) {
		this.Cp = cp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}