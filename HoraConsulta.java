package practicaConsultorio;

public class HoraConsulta {

	private byte h, m;

	// Estas variable representa la minima diferencia de hora entre las citas, la
	// hora a la que abre y la hora a la que cierra el consultorio respectivamente
	private static byte dif = 30, horaAbreConsultorio = 9, horaCierreConsultorio = 17;

	public HoraConsulta() {
		h = 0;
		m = 0;
	}

	// El operador ternario cumple la funcion de asegurar que las horas (h)
	// se encuentren entre 0 y 23 y los minutos (m) entre 0 y 60

	public HoraConsulta(byte hora, byte minuto) {
		this.h = (hora >= horaAbreConsultorio && hora < horaCierreConsultorio) ? hora : horaAbreConsultorio;
		this.m = (minuto >= 0 && minuto < 60) ? minuto : 0;
	}

	public void setHora(byte h, byte m) {
		h = (h >= horaAbreConsultorio && h < horaCierreConsultorio) ? h : horaAbreConsultorio;
		m = (m >= 0 && m < 60) ? m : 0;
	}

	// Esta funcion se utiliza para asegurar que haya un intervalo de
	// al menos 30 minutos para evitar choques de horario

	public static int validarDiferenciaHora(HoraConsulta a, HoraConsulta b) {
		if (a.h * 60 + a.m - b.h * 60 + b.m >= dif || b.h * 60 + b.m - a.h * 60 + a.m >= dif)
			return 1;
		else
			return 0;
	}

	public String toString() {
		//Por razones de formato si m es menor a 10 se imprime un 0 adelante
		//Para tener por ejemplo 5:05 en lugar de 5:5
		if (m < 10)
			return h + ":0" + m;
		else
			return h + ":" + m;
	}

}