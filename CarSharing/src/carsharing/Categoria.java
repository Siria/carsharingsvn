package carsharing;

import java.util.LinkedList;


/**
 * @uml.dependency   supplier="carsharing.Auto"
 */
public class Categoria {

	/**
	 * @uml.property   name="automobile"
	 * @uml.associationEnd   multiplicity="(0 -1)" ordering="true" inverse="categoria:carsharing.Auto"
	 * @uml.association   name="appartieneAlla"
	 */
	private LinkedList<Auto> automobile;

	/**
	 * Getter of the property <tt>automobile</tt>
	 * @return  Returns the automobile.
	 * @uml.property  name="automobile"
	 */
	public LinkedList<Auto> getAutomobile() {
		return automobile;
	}

	/**
	 * Setter of the property <tt>automobile</tt>
	 * @param automobile  The automobile to set.
	 * @uml.property  name="automobile"
	 */
	public void setAutomobile(LinkedList<Auto> automobile) {
		this.automobile = automobile;
	}

}
