package Examen;

public class ExamenED {
    
        static final int N=4;
    
   
    static void transpose(int A[][], int B[][]) {
        int i, j;
        for (i = 0; i < N; i++) //Elimino el = en i<=N
            for (j = 0; j < N; j++)
                B[i][j] = A[j][i]; //Elimino +1 y -1 en A[j+1][i-1]
    }
 
    public static void main(String[] args) {
        int A[][] = {{1, 1, 1, 1},
                	{2, 2, 2, 2},
                	{3, 3, 3, 3},
                	{4, 4, 4, 4}};
 
        int B[][] = new int[N][N], i, j;
        System.out.println("Transpuesta de una matriz:\n");
 
        System.out.println("\nAntes de  Transponer:");
 
        Mostrar(A);
 
        transpose(A, B);
 
        System.out.println("\nDespués de  Transponer:");
        Mostrar(B);
    }
 
    private static void Mostrar(int[][] b) {
        int i;
        int j;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) //Elimino el = en j<=N
                System.out.print(b[i][j] + " ");
            System.out.print("\n");
        }
    }
}

//David García Rodríguez

