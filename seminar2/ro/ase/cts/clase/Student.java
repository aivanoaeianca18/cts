package ro.ase.cts.clase;


public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static float sumaFinantata=20;
	
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAnStudii() {
		return anStudii;
	}
	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}


	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int anStudii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}
	@Override
	public String toString() {
		StringBuilder str=new StringBuilder( "Student: ");
		str.append(super.toString()).append(", facultate=").append(facultate).append(", an de studii=").append(anStudii);
		return str.toString();
	}
	
	
	
	@Override
	public float getSumaFinantata() {
		// TODO Auto-generated method stub
		return sumaFinantata;
	}
	public static float getFinantare() {
		return sumaFinantata;
	}
	public static void setSumaFinantata(float sumaFinantata) {
		Student.sumaFinantata = sumaFinantata;
	}
	
	
	
}
