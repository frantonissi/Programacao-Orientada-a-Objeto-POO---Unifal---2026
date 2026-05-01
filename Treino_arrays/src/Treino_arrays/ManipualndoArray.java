package Treino_arrays;

public class ManipualndoArray {

    private int[] array1;
    private int[] array2 = array1;
    private int[][] matriz = new int[5][];

    public int[] getArray1() {
        return array1;
    }

    public void setArray1(int[] array1) {
        this.array1 = array1;
    }

    public int[] getArray2() {
        return array2;
    }

    public void setArray2(int[] array2) {
        this.array2 = array2;
    }

    public  void exibirArray1(){

        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i]);
            if((i + 1) < array1.length){
                System.out.print(',');
            }
        }
    }


    public void exibirArray2(int [][] v){

        for(int i = 0; i < array2.length; i++){
            System.out.print(array2[i]);
            if((i + 1) < array2.length){
                System.out.print(',');
            }
        }
    }

    public void TesteArrays(){

        for(int i = 0; i < array2.length; i = i + 2){
            array2[i] = i;
        }

    }

    public void preencherMatrizs() {

        int j = 0;

    for(int i = 0; i < matriz.length; i++){
        matriz[i] = new int[i];
            for( j = 0; j < matriz[i].length; j++){
               matriz[i][j] = i * j;

            }
    }

    }

    public void exibirMatriz() {
        // Primeiro for: passa por cada "linha" da matriz
        for(int i = 0; i < matriz.length; i++){

            // Segundo for: passa pelas "colunas" daquela linha específica
            for(int j = 0; j < matriz[i].length; j++){

                System.out.print(matriz[i][j]); // Imprime o número
            }
            // Depois que terminar de imprimir todos os números daquela linha,
            // dá um "Enter" (println vazio) para a próxima linha ir para baixo
            System.out.println();
        }
    }
}
