package ro.ase.cts.flyweight.clase;

public class Client implements FlyweightAbstract{
	private String numeClient;
	private String nrTelefon;
	private String adresaEmail;
	
	

	public Client(String numeClient, String nrTelefon, String adresaEmail) {
		super();
		this.numeClient = numeClient;
		this.nrTelefon = nrTelefon;
		this.adresaEmail = adresaEmail;
	}



	@Override
	public void afiseazaInformatii(Rezervare rezervare) {
		System.out.println(this.toString()+rezervare.toString());
		
	}



	@Override
	public String toString() {
		return "Client [numeClient=" + numeClient + ", nrTelefon=" + nrTelefon + ", adresaEmail=" + adresaEmail + "]";
	}
	
	
	
	

}
