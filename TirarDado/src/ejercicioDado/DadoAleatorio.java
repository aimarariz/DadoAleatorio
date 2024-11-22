package ejercicioDado;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class DadoAleatorio {
	
	public static void main(String[] args) {
		
		int frecuencia1 = 0;
		int frecuencia2 = 0;
	    int frecuencia3 = 0;
	    int frecuencia4 = 0;
	    int frecuencia5 = 0;
	    int frecuencia6 = 0;
	    
	    int cara;
	    
		for (int tiro = 1; tiro <= 6000; tiro++) {
			cara = 1 + (int) (Math.random() * 6);

			switch (cara) {
			case 1:
				++frecuencia1;
				break;
			case 2:
				++frecuencia2;
				break;
			case 3:
				++frecuencia3;
				break;
			case 4:
				++frecuencia4;
				break;
			case 5:
				++frecuencia5;
				break;
			case 6:
				++frecuencia6;
				break;
			}
		}
		
		JTextArea salida = new JTextArea();
		
		salida.setText("Cara\tFrecuencia\n1\t" + frecuencia1 + 
				"\n2\t" + frecuencia2 + "\n3\t" + frecuencia3 + 
				"\n4\t" + frecuencia4 + "\n5\t" + frecuencia5 + 
				"\n6\t" + frecuencia6);
		
		JOptionPane.showMessageDialog(null, salida, "Tiro de un dado 6000 veces", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
	}
	
	
	

}
