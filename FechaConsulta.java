package practicaConsultorio;

public class FechaConsulta {

	private byte dia, mes;
	short anio;

	public FechaConsulta() {
		dia = 1;
		mes = 1;
		anio = 2022;

	}

	public FechaConsulta(byte dia, byte mes, short anio) {

		this.anio = anio > 2022 ? anio : 2022;
		this.mes = (mes >= 1 && mes <= 12) ? mes : 1;
		this.dia = validarEntradaDia(dia, mes, anio);

	}

	public void setFecha(byte d, byte m, short a) {

		anio = a > 2022 ? a : 2022;
		mes = (m >= 1 && m <= 12) ? m : 1;
		dia = validarEntradaDia(d, m, a);
	}

	/*
	 * Esta funcion valida la entrada del dia segun el mes y el año Los meses 1, 3,
	 * 5, 7, 8, 10 y 12 tienen 31 dias Los meses 5, 6, 9 y 11 tienen 30 dias. Febrero
	 * tiene 28 dias en los años tropicales y 29 en los años bisietos
	 */
	public byte validarEntradaDia(byte d, byte m, short a) {

		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
			d = (d >= 1 && d <= 31) ? d : 1;

		if (m == 4 || m == 6 || m == 9 || m == 11)
			d = (d >= 1 && d <= 30) ? d : 1;

		if (m == 2 && a % 4 == 0)
			d = (d >= 1 && d <= 29) ? d : 1;

		if (m == 2 && a % 4 != 0)
			d = (d >= 1 && d <= 28) ? d : 1;

		return d;
	}

	// Esta funcion permite determinar si dos fechas son iguales
	public static int compararFecha(FechaConsulta a, FechaConsulta b) {
		if (a.dia == b.dia && a.mes == b.mes && a.anio == b.anio)
			return 1;
		else
			return 0;
	}

	public String toString() {
		return dia + "/" + mes + "/" + anio;
	}

}
