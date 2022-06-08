package SO;

public class Processo {

	private int tamProc;
	private String nomeProc;
	private Boolean alocado;
	
	public Processo(int tamProc, String nomeProc, Boolean alocado) {
		super();
		this.tamProc = tamProc;
		this.nomeProc = nomeProc;
		this.alocado = alocado;
	}

	
	public Boolean getAlocado() {
		return alocado;
	}

	public void setAlocado(Boolean alocado) {
		this.alocado = alocado;
	}

	public int getTamProc() {
		return tamProc;
	}

	public void setTamProc(int tamProc) {
		this.tamProc = tamProc;
	}

	public String getNomeProc() {
		return nomeProc;
	}

	public void setNomeProc(String nomeProc) {
		this.nomeProc = nomeProc;
	}
	
}