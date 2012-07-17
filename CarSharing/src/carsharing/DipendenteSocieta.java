package carsharing;


/**
 * @uml.dependency   supplier="carsharing.Socio"
 * @uml.dependency   supplier="carsharing.Societa"
 */
public class DipendenteSocieta extends Socio {

	/**
	 * @uml.property   name="societa"
	 * @uml.associationEnd   multiplicity="(1 1)" inverse="dipendenteSocieta:carsharing.Societa"
	 * @uml.association   name="lavora"
	 */
	private Societa societa = new carsharing.Societa();

	/** 
	 * Getter of the property <tt>societa</tt>
	 * @return  Returns the societa.
	 * @uml.property  name="societa"
	 */
	public Societa getSocieta() {
		return societa;
	}

	/** 
	 * Setter of the property <tt>societa</tt>
	 * @param societa  The societa to set.
	 * @uml.property  name="societa"
	 */
	public void setSocieta(Societa societa) {
		this.societa = societa;
	}

}
