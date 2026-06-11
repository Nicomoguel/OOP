class Matriz{
	private int[][] matrix;
	private int filas;
	private int columnas;

	public Matriz(int [][] biArr){
		matrix = biArr;
		filas = 4;
		columnas = 4;
	}

	public Matriz(int[][] biArr, int n, int m){
		matrix = biArr;
		filas = n;
		columnas = m;
	}
	public int[][] multMatriz(int[][] biArr){
		int[][] nuevaMatriz = new int[filas][columnas];
		for(int i = 0; i < filas; i++){
			for(int j = 0; j < columnas; j++){
				for(int k = 0; k < filas; k++){
					nuevaMatriz[i][j] += matrix[i][k] + biArr[k][j];
				}
			}
		}
		return nuevaMatriz;
	}
	public int[][] sumMatriz(int [][] biArr){	
		int[][] nuevaMatriz = new int[filas][columnas];
		for(int i = 0; i < filas; i++){
			for(int j = 0; j < columnas; j++){
				nuevaMatriz[i][j] = matrix[i][j] + biArr[i][j];
			}
		}
		return nuevaMatriz;
	}

	public int[][]getMatriz(){
		return matrix;
	}

	public int getMatrizAt(int i, int j){
		return matrix[i][j];
	}

}
