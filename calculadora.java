public class calculadora{
	private int numero1;
	private int numero2;
	
	public calculadora(){
		numero1 = 1;
		numero2 = 2;
	}

	public calculadora(int n1, int n2){
		numero1 = n1;
		numero2 = n2;
	}


	//public void set_nums(int num1, int num2){
	//	numero1 = num1;
	//	numero2 = num2;
	//}

	public String mayor(){
		if(numero1 > numero2){
			return numero1 +  " es mayor que " + numero2;
		}else if(numero2 > numero1){
			return numero2 +  " es mayor que " + numero1;
		}else{
			return "Los numeros son iguales";
		}
	}

	public int suma(){
		return numero1 + numero2;
	}
	public int resta(){
		return numero1 - numero2;
	}
	public int multiplicacion(){
		return numero1 * numero2;
	}
	public int division(){
		return numero1 / numero2;
	}
}
