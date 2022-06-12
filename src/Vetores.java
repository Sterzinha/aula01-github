import java.util.Random;

public class Vetores {
    public static void main(String[] args) {
        int[] vetA = new int[43];
        int[] vetB = new int[43];
        int[] vetC = new int[43];
        Random aleatorio = new Random();
        int ultimaPosicaoVetB = vetB.length;

        //Preenchendo os vetores A e B com numeros aleatorios de 0 a 100
        for (int i = 0; i < 43; i++){
            vetA[i] = 0 + aleatorio.nextInt(100);
            vetB[i] = 0 + aleatorio.nextInt(100);
        }
        //Preenchendo o vetor C, multiplicando a primeira posicao do VetA com
        //a ultima posicao do VetB
        for (int j = 0; j < 43; j++) {
            vetC[j] = vetA[j] * vetB[ultimaPosicaoVetB-1];
            ultimaPosicaoVetB -= 1;
        }

        //Questão A
        System.out.println("O primeiro valor do VetC é " + vetC[0]);
        System.out.println("O ultimo valor do VetC é  " + vetC[vetC.length-1]);

        //Questão B
        int menor = vetC[0];
        int maior = vetC[1];
        int posicaoMenor = 0;
        int posicaoMaior = 0;

        for (int k = 0; k < 43; k++){
            if (vetC[k] < menor) {
                menor = vetC[k];
                posicaoMenor = k;
            } else if (vetC[k] > maior){
                maior = vetC[k];
                posicaoMaior = k;
            }
        }
        System.out.println("O maior numero está na posição " + posicaoMaior);
        System.out.println("O menor numero está na posição " + posicaoMenor);

        //QUESTÃO C

        int qtdPar = 0;
        int qtdImpar = 0;

        for (int l = 0; l < 43; l++){
            if (vetC[l] % 2 == 0) {
                qtdPar++;
            } else {
                qtdImpar++;
            }
        }
        System.out.println("Existem " + qtdPar + " numeros pares e " + qtdImpar + " numeros impares");

    }
}
