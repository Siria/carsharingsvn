package carsharing;

import java.util.LinkedList;


public class Categoria {

	/**
	 * @uml.property  name="automobile"
	 * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" inverse="categoria:carsharing.Automobile"
	 * @uml.association  name="appartieneAlla"
	 */
	private LinkedList<Automobile> automobile;

	/**
	 * Getter of the property <tt>automobile</tt>
	 * @return  Returns the automobile.
	 * @uml.property  name="automobile"
	 */
	public LinkedList<Automobile> getAutomobile() {
		return automobile;
	}

	/**
	 * Setter of the property <tt>automobile</tt>
	 * @param automobile  The automobile to set.
	 * @uml.property  name="automobile"
	 */
	public void setAutomobile(LinkedList<Automobile> automobile) {
		this.automobile = automobile;
	}

}
