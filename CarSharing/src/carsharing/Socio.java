package carsharing;

import java.util.LinkedList;



/**
 * @uml.dependency   supplier="carsharing.Noleggio"
 */
public class Socio {

	/**
	 * @uml.property  name="noleggio"
	 * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" inverse="socio:carsharing.Noleggio"
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
	 * Setter of the property <tt>noleggio</tt>
	 * @param noleggio  The noleggio to set.
	 * @uml.property  name="noleggio"
	 */
	public void setNoleggio(LinkedList<Noleggio> noleggio) {
		this.noleggio = noleggio;
	}

}
