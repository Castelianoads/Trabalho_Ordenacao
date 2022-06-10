public class App {
    public static void main(String[] args) {
        int quantidade = 1000000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*quantidade);
        }
        long tempoInicial = System.currentTimeMillis();

        AlgoritmoSimples.insertionSort(vetor);
        long tempoFinal = System.currentTimeMillis();
        long tempoMs = tempoFinal - tempoInicial;
        long tempoM = tempoMs / 60000;
        System.out.println("Executado em = " + tempoMs + " ms ou " + tempoM + " minutos.");
    }

}
