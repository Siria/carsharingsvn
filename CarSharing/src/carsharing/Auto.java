package carsharing;

import java.util.LinkedList;


/**
 * @uml.dependency   supplier="carsharing.Noleggio"
 */
public class Auto {

	/**
	 * @uml.property  name="noleggio"
	 * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" inverse="automobile:carsharing.Noleggio"
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

	/**
	 * @uml.property  name="categoria"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="automobile:carsharing.Categoria"
	 * @uml.association  name="appartieneAlla"
	 */
	private Categoria categoria = new carsharing.Categoria();

	/**
	 * Getter of the property <tt>categoria</tt>
	 * @return  Returns the categoria.
	 * @uml.property  name="categoria"
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * Setter of the property <tt>categoria</tt>
	 * @param categoria  The categoria to set.
	 * @uml.property  name="categoria"
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
