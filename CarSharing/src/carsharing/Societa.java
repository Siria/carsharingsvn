package carsharing;


import java.util.LinkedList;


/**
 * @uml.dependency   supplier="carsharing.DipendenteSocieta"
 */
public class Societa {

	/**
	 * @uml.property   name="dipendenteSocieta"
	 * @uml.associationEnd   multiplicity="(0 -1)" ordering="true" inverse="societa:carsharing.DipendenteSocieta"
	 * @uml.association   name="lavora"
	 */
	private LinkedList<DipendenteSocieta> dipendenteSocieta;

	/** 
	 * Getter of the property <tt>dipendenteSocieta</tt>
	 * @return  Returns the dipendenteSocieta.
	 * @uml.property  name="dipendenteSocieta"
	 */
	public LinkedList<DipendenteSocieta> getDipendenteSocieta() {
		return dipendenteSocieta;
	}

	/** 
	 * Setter of the property <tt>dipendenteSocieta</tt>
	 * @param dipendenteSocieta  The dipendenteSocieta to set.
	 * @uml.property  name="dipendenteSocieta"
	 */
	public void setDipendenteSocieta(LinkedList<DipendenteSocieta> dipendenteSocieta) {
		this.dipendenteSocieta = dipendenteSocieta;
	}

}
