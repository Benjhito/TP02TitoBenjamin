package ar.edu.unju.edm.model;
import java.time.LocalDate;
import org.springframework.stereotype.Component;

@Component
public class Persona {
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNac;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String apellido, String fechaDeNac) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNac = LocalDate.parse(fechaDeNac);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaDeNac() {
		return fechaDeNac;
	}

	public void setFechaDeNac(LocalDate fechaDeNac) {
		this.fechaDeNac = fechaDeNac;
	}
}
