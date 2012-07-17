package carsharing;

import java.util.LinkedList;


/**
 * @uml.dependency   supplier="carsharing.Noleggio"
 */
public class Garage {

	/**
	 * @uml.property   name="noleggio"
	 * @uml.associationEnd   multiplicity="(0 -1)" ordering="true" inverse="garageIniziale:carsharing.Noleggio"
	 * @uml.association   name="presaInConsegna"
	 */
	private LinkedList<Noleggio> noleggio;

	/** 
	 * Getter of the property <tt>noleggio</tt>
	 * @return  Returns the noleggio.
	 * @uml.property  name="noleggio"
	 */
	public LinkedList<Noleggio> getNoleggio() {
		return noleggio;
	}

	/**
	 * @uml.property   name="noleggio1"
	 * @uml.associationEnd   multiplicity="(0 -1)" ordering="true" inverse="garageFinale:carsharing.Noleggio"
	 * @uml.association   name="rilascio"
	 */
	private LinkedList<Noleggio> noleggio1;

	/** 
	 * Getter of the property <tt>noleggio1</tt>
	 * @return  Returns the noleggio1.
	 * @uml.property  name="noleggio1"
	 */
	public LinkedList<Noleggio> getNoleggio1() {
		return noleggio1;
	}

	/** 
	 * Setter of the property <tt>noleggio</tt>
	 * @param noleggio  The noleggio to set.
	 * @uml.property  name="noleggio"
	 */
	public void setNoleggio(LinkedList<Noleggio> noleggio) {
		this.noleggio = noleggio;
	}

	/** 
	 * Setter of the property <tt>noleggio1</tt>
	 * @param noleggio1  The noleggio1 to set.
	 * @uml.property  name="noleggio1"
	 */
	public void setNoleggio1(LinkedList<Noleggio> noleggio1) {
		this.noleggio1 = noleggio1;
	}

}
