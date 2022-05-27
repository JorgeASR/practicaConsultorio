package practicaConsultorio;

public class Paciente {

	private String nombre;

	private int numHistoria;

	private short numConsultas;

	private byte edad;

	private FechaConsulta fechaCita;

	private HoraConsulta horaCita;

	public Paciente() {
		nombre = "";
		numHistoria = 0;
		edad = 0;
		numConsultas = 0;
		fechaCita = new FechaConsulta();
		horaCita = new HoraConsulta();
	}

	public void setNobre(String n) {
		nombre = n;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNumHistoria(int n) {
		numHistoria = n;
	}

	public int getNumHistoria() {
		return numHistoria;
	}

	public void setNumConsultas(short n) {
		numConsultas = n;
	}

	public short getNumConsultas() {
		return numConsultas;
	}

	public void setEdad(byte e) {
		edad = e;
	}

	public short getEdad() {
		return edad;
	}
	
	public void setFechaCita(FechaConsulta x) {
		fechaCita = x;
	}
	
	public FechaConsulta getFechaCita() {
		return fechaCita;
	}

	public void setHoraCita(HoraConsulta x) {
		horaCita = x;
	}
	
	public HoraConsulta getHoraCita() {
		return horaCita;
	}

}
