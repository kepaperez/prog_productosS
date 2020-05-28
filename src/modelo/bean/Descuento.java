package modelo.bean;
/**
 * 
 * @author kepa perez
 *
 */
public class Descuento {
	private int id;
	private int valor;
	private String descripion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getDescripion() {
		return descripion;
	}

	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}

	@Override
	public String toString() {
		return "Descuento [id=" + id + ", valor=" + valor + ", descripion=" + descripion + "]";
	}

}
