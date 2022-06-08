package SO;

import java.util.ArrayList;

public class FirstFit {

	public static void AlocaProcesso(ArrayList<Memoria> memoria, ArrayList<Processo> processo) {
	
	for(Memoria mem: memoria) {
		int tamBloq = mem.getTamBloco();
		for(Processo proc: processo) {
			int tamProc = proc.getTamProc();
			
			if(tamBloq > tamProc && !proc.getAlocado()) {
				tamBloq = tamBloq - tamProc;
				mem.setTamBloco(tamBloq);
				proc.setAlocado(true);
			}
			
			
		
		}
	}
		
	}
}