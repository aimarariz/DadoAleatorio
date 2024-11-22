package ejercicioDado;



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
		
	}
	
	
	

}
