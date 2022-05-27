package practicaConsultorio;

import java.util.ArrayList;

public class ListaCitas {

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
		 * Si aux es igual a 1 significa que hay un paciente en la lita con cita para el
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

	public String toStringPacientesPorNumCitas(Paciente a, Paciente b) {
		//Si a tiene mas consultas que b
		if (a.getNumConsultas() > b.getNumConsultas())
			return "1- " + a.getNombre() + " " + a.getNumConsultas() + " Consultas 2-" + b.getNombre() + " "
					+ b.getNumConsultas() + " Consultas";
		
		//Si a y b tiene igual numero de consultas
		else if (a.getNumConsultas() == b.getNumConsultas())
			return "Los pacientes: " + a.getNombre() + " y " + b.getNombre() + " han ido a " + a.getNumConsultas()
					+ " Consultas";
		
		//Si b tiene mas consultas que a
		else
			return "1- " + b.getNombre() + " " + b.getNumConsultas() + " Consultas 2-" + a.getNombre() + " "
					+ a.getNumConsultas() + " Consultas";
	}

}
