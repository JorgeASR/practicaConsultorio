package practicaConsultorio;

import java.util.ArrayList;

public class ListaCitas {

	private static String nombreDoctorDelConsultorio = "Gregorio Casas";
	private ArrayList<Paciente> listaCitas;

	public ListaCitas() {
		listaCitas = new ArrayList<Paciente>();
	}

	public void CitarPaciente(Paciente x) {

		int index = 0, aux = 0;
		/*
		 * La variable local aux aumentara si hay otros pacientes en la lista con citas
		 * para el mismo dia que x, esto con el objetivo de llevar la restriccion de
		 * maximo dos pacientes por dia
		 * 
		 * La variable index almacenara cual paciente de la lista tiene cita para la
		 * misma fecha que x, esto con el objetivo de poder validar la diferencia de
		 * hora entre ambos elementos
		 */

		for (int i = 0; i < listaCitas.size(); i++) {
			if (x.getFechaCita() == listaCitas.get(i).getFechaCita()) {
				aux++;
				index = i;
			}
		}

		/*
		 * Si aux es igual a 1 significa que hay un paciente en la lista con cita para el
		 * mismo dia que x. Si aux es igual a 0 significa que no hay otros pacientes en
		 * la lista con cita para el mismo dia que x *
		 */

		if (aux == 1) {
			if (HoraConsulta.validarDiferenciaHora(x.getHoraCita(), listaCitas.get(index).getHoraCita()) == 1)
				listaCitas.add(x);
		}
		if (aux == 0) {
			listaCitas.add(x);
		}
	}

	public void mostrarPacientesPorNumCitas(Paciente a, Paciente b) {
		System.out.println("En el consultorio del doctor " + nombreDoctorDelConsultorio + " estos pacientes ");
		System.out.println("se organizan de esta manera segun el numero de citas:");
		System.out.println(Paciente.toStringPacientesPorNumCitas(a, b));
	}

}
