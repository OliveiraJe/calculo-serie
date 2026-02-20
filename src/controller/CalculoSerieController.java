package controller;

public class CalculoSerieController {
	public CalculoSerieController() {
		super();
	}
	
	public double calculo(int n) {
		//condição de parada quando n chega a 1, retorna o primeiro termo(1/1 = 1)
		if(n == 1) {
			return 1.0;
		}
		//a soma de N termos é(o termo atual 1/N) + (a soma dos termos de 1 até n-1)
		else {
			return (1.0 / n) + calculo(n - 1); 
		}
	}

}
