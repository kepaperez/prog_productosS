package modelo.bean;

import java.util.Date;

public class Producto {
	
	private int id;
	private String nombre;
	private int stock;
	private Date fecha_compra;
	private String color;
	private String made_in; //Name del estado
	private Double precio;
	private int descuento;
	private String tallas; //tallas separados por coma ej.: S,L
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Date getFecha_compra() {
		return fecha_compra;
	}
	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMade_in() {
		return made_in;
	}
	public void setMade_in(String made_in) {
		this.made_in = made_in;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public String getTallas() {
		return tallas;
	}
	public void setTallas(String tallas) {
		this.tallas = tallas;
	}
	public void setTallas(String[] tallas) {
		String cadena = "";
		
		if(tallas!=null) {
			for (int i = 0; i < tallas.length-1; i++) {
				cadena = cadena + tallas[i] + ",";
			}
			cadena = cadena + tallas[tallas.length-1];
		}
		
		this.tallas = cadena;
	}
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", stock=" + stock + ", fecha_compra=" + fecha_compra
				+ ", color=" + color + ", made_in=" + made_in + ", precio=" + precio + ", descuento=" + descuento
				+ ", tallas=" + tallas + "]";
	}
	
	
}
