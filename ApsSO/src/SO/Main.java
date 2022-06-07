package SO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("ArquivoTxt/entrada.txt");
		
		Scanner scan = new Scanner(file);
		ArrayList<Processo> p = new ArrayList<Processo>();
		
		int[] tamIni = new int [0];
		int[] seqProc = new int [0];
		int cont = 0;
		
		
		while(scan.hasNextLine()) {
			String linha[] = scan.nextLine().split(";");
			
		if(cont == 0) {
			tamIni = new int[linha.length];
			for(int i =0; i < linha.length; i++) {
			tamIni[i] = Integer.parseInt(linha[i]);	
			}
		}
		else {
			seqProc = new int[linha.length];
			for(int i =0; i < linha.length; i++) {
				//seqProc[i] = Integer.parseInt(linha[i]);
				p.add(new Processo(Integer.parseInt(linha[i]), "P" + (i+1)));
				
				//p[i].setTamProc(Integer.parseInt(linha[i]));
				//p[i].setNomeProc("P" + (i+1));
			}			
		}
			cont++;
		}
		for(Processo processo: p) {
			
		System.out.println(processo.getTamProc());
		}
	}

}
