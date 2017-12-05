package vos;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class ListaProductos {
	
	/**
	 * List con los videos
	 */
	@JsonProperty(value="productos")
	private List<Producto> productos;
	
	/**
	 * Constructor de la clase ListaVideos
	 * @param videos - videos para agregar al arreglo de la clase
	 */
	public ListaProductos( @JsonProperty(value="productos")List<Producto> productos){
		this.productos = productos;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	


}
