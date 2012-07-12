package carsharing;


public class Noleggio {

	/**
	 * @uml.property  name="garage"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="noleggio:carsharing.Garage"
	 * @uml.association  name="presaInConsegna"
	 */
	private Garage garage = new carsharing.Garage();

	/**
	 * Getter of the property <tt>garage</tt>
	 * @return  Returns the garage.
	 * @uml.property  name="garage"
	 */
	public Garage getGarage() {
		return garage;
	}

	/**
	 * Setter of the property <tt>garage</tt>
	 * @param garage  The garage to set.
	 * @uml.property  name="garage"
	 */
	public void setGarage(Garage garage) {
		this.garage = garage;
	}

	/**
	 * @uml.property  name="garage1"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="noleggio1:carsharing.Garage"
	 * @uml.association  name="rilascio"
	 */
	private Garage garage1 = new carsharing.Garage();

	/**
	 * Getter of the property <tt>garage1</tt>
	 * @return  Returns the garage1.
	 * @uml.property  name="garage1"
	 */
	public Garage getGarage1() {
		return garage1;
	}

	/**
	 * Setter of the property <tt>garage1</tt>
	 * @param garage1  The garage1 to set.
	 * @uml.property  name="garage1"
	 */
	public void setGarage1(Garage garage1) {
		this.garage1 = garage1;
	}

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
	 * @uml.property  name="automobile"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="noleggio:carsharing.Automobile"
	 */
	private Automobile automobile = new carsharing.Automobile();

	/**
	 * Getter of the property <tt>automobile</tt>
	 * @return  Returns the automobile.
	 * @uml.property  name="automobile"
	 */
	public Automobile getAutomobile() {
		return automobile;
	}

	/**
	 * Setter of the property <tt>automobile</tt>
	 * @param automobile  The automobile to set.
	 * @uml.property  name="automobile"
	 */
	public void setAutomobile(Automobile automobile) {
		this.automobile = automobile;
	}

}
