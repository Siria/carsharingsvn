package carsharing;


public class Noleggio {

	/** 
	 * @uml.property name="garageIniziale"
	 * @uml.associationEnd multiplicity="(1 1)" inverse="noleggio:carsharing.Garage"
	 * @uml.association name="presaInConsegna"
	 */
	private Garage garage = new carsharing.Garage();

	/** 
	 * @uml.property name="garageFinale"
	 * @uml.associationEnd multiplicity="(1 1)" inverse="noleggio1:carsharing.Garage"
	 * @uml.association name="rilascio"
	 */
	private Garage garage1 = new carsharing.Garage();

	/**
	 * @uml.property  name="socio"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="noleggio:carsharing.Socio"
	 */
	private Socio socio = new carsharing.Socio();

	/**
	 * Getter of the property <tt>socio</tt>
	 * @return  Returns the socio.
	 * @uml.property  name="socio"
	 */
	public Socio getSocio() {
		return socio;
	}

	/**
	 * Setter of the property <tt>socio</tt>
	 * @param socio  The socio to set.
	 * @uml.property  name="socio"
	 */
	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	/**
	 * @uml.property   name="automobile"
	 * @uml.associationEnd   multiplicity="(1 1)" inverse="noleggio:carsharing.Auto"
	 */
	private Auto automobile = new carsharing.Auto();

	/**
	 * Getter of the property <tt>automobile</tt>
	 * @return  Returns the automobile.
	 * @uml.property  name="automobile"
	 */
	public Auto getAutomobile() {
		return automobile;
	}

	/**
	 * Setter of the property <tt>automobile</tt>
	 * @param automobile  The automobile to set.
	 * @uml.property  name="automobile"
	 */
	public void setAutomobile(Auto automobile) {
		this.automobile = automobile;
	}

	/**
	 * Getter of the property <tt>garageIniziale</tt>
	 * @return  Returns the garage.
	 * @uml.property  name="garageIniziale"
	 */
	public Garage getGarageIniziale() {
		return garage;
	}

	/**
	 * Setter of the property <tt>garageIniziale</tt>
	 * @param garageIniziale  The garage to set.
	 * @uml.property  name="garageIniziale"
	 */
	public void setGarageIniziale(Garage garageIniziale) {
		garage = garageIniziale;
	}

	/**
	 * Getter of the property <tt>garageFinale</tt>
	 * @return  Returns the garage1.
	 * @uml.property  name="garageFinale"
	 */
	public Garage getGarageFinale() {
		return garage1;
	}

	/**
	 * Setter of the property <tt>garageFinale</tt>
	 * @param garageFinale  The garage1 to set.
	 * @uml.property  name="garageFinale"
	 */
	public void setGarageFinale(Garage garageFinale) {
		garage1 = garageFinale;
	}

}
