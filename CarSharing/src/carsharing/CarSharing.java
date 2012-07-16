package carsharing;

import java.util.LinkedList;


public class CarSharing {

	/**
	 * @uml.property  name="socio"
	 * @uml.associationEnd  inverse="carSharing:carsharing.Socio"
	 */
	private Socio socio;

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
	 * @uml.property  name="garage"
	 * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" inverse="carSharing:carsharing.Garage"
	 */
	private LinkedList<Garage> garage;

	/**
	 * Getter of the property <tt>garage</tt>
	 * @return  Returns the garage.
	 * @uml.property  name="garage"
	 */
	public LinkedList<Garage> getGarage() {
		return garage;
	}

	/**
	 * Setter of the property <tt>garage</tt>
	 * @param garage  The garage to set.
	 * @uml.property  name="garage"
	 */
	public void setGarage(LinkedList<Garage> garage) {
		this.garage = garage;
	}

	/**
	 * @uml.property  name="categoria"
	 * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" inverse="carSharing:carsharing.Categoria"
	 */
	private LinkedList<Categoria> categoria;

	/**
	 * Getter of the property <tt>categoria</tt>
	 * @return  Returns the categoria.
	 * @uml.property  name="categoria"
	 */
	public LinkedList<Categoria> getCategoria() {
		return categoria;
	}

	/**
	 * Setter of the property <tt>categoria</tt>
	 * @param categoria  The categoria to set.
	 * @uml.property  name="categoria"
	 */
	public void setCategoria(LinkedList<Categoria> categoria) {
		this.categoria = categoria;
	}

	/**
	 * @uml.property  name="auto"
	 * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" inverse="carSharing:carsharing.Auto"
	 */
	private LinkedList<Auto> auto;

	/**
	 * Getter of the property <tt>auto</tt>
	 * @return  Returns the auto.
	 * @uml.property  name="auto"
	 */
	public LinkedList<Auto> getAuto() {
		return auto;
	}

	/**
	 * Setter of the property <tt>auto</tt>
	 * @param auto  The auto to set.
	 * @uml.property  name="auto"
	 */
	public void setAuto(LinkedList<Auto> auto) {
		this.auto = auto;
	}

}
