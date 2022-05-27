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
	
	public Paciente(String nombre, int numHistoria, short numConsultas, byte edad, FechaConsulta f, HoraConsulta h) {
		this.nombre=nombre;
		this.numHistoria=numHistoria;
		this.numConsultas=numConsultas;
		this.edad=edad;
		this.fechaCita=f;
		this.horaCita=h;
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

	public static String toStringPacientesPorNumCitas(Paciente a, Paciente b) {
		// Si a tiene mas consultas que b
		if (a.numConsultas > b.numConsultas)
			return "1- " + a.nombre + " " + a.numConsultas + " Consultas 2-" + b.nombre + " " + b.numConsultas
					+ " Consultas";

		// Si a y b tiene igual numero de consultas
		else if (a.numConsultas == b.numConsultas)
			return "Los pacientes: " + a.nombre + " y " + b.nombre + " han ido a " + a.numConsultas + " Consultas";

		// Si b tiene mas consultas que a
		else
			return "1- " + b.nombre + " " + b.numConsultas + " Consultas 2-" + a.nombre + " " + a.numConsultas
					+ " Consultas";
	}

}
