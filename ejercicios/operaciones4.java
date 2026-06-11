class operaciones4{
	public static void main(String s[]){
		int[][] arr1 = {{3, 4, 2, 8},
				{5, 6, 3, 2},
				{8, 9, 8, 3},
				{1, 6, 4, 6}};
		int[][] arr2 = {{6, 8, 9, 10},
				{2, 1, 5, 3},
				{7, 8, 5, 4},
				{1, 2, 9, 7},
				{0, 5, 3, 2}};
		int filas = 4;
		int columnas = 4;

		Matriz mtrz1 = new Matriz(arr1, filas, columnas);
		Matriz mtrz2 = new Matriz(arr2, filas, columnas);
		Matriz mtrz_multiplicada = new Matriz(mtrz1.multMatriz(mtrz2.getMatriz()));
		Matriz mtrz_sumada = new Matriz(mtrz1.sumMatriz(mtrz2.getMatriz()));

		for(int i = 0; i < filas; i++){
			for(int j = 0; j < columnas; j++){
				System.out.print(mtrz_multiplicada.getMatrizAt(i, j) + ", ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i < filas; i++){
                          for(int j = 0; j < columnas; j++){
                                  System.out.print(mtrz_sumada.getMatrizAt(i, j) + ", ");
                          }
                          System.out.println();
                  }

	}

}
