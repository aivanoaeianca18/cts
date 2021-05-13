package ro.ase.cts.observer.clase;

public class ManagerSala extends Subiect{
	public void anuntaMeciFotbal() {
		super.notificaClienti("A fost progamat un nou meci de fotbal");
	}
	public void anuntaMeciVolei() {
		super.notificaClienti("A fost progamat un nou meci de volei");
	}
	public void anuntaMeciHandbal() {
		super.notificaClienti("A fost progamat un nou meci de handbal");
	}
}
