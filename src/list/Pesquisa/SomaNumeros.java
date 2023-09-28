package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer num : numeros) {
            soma += num;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maior = 0;
        if (!numeros.isEmpty()) {
            for (Integer num : numeros) {
                if (num >= maior) {
                    maior = num;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = 0;
        if (!numeros.isEmpty()) {
            for (Integer num : numeros) {
                if (num <= menor) {
                    menor = num;
                }
            }
        } 
        return menor;
    }

    public void exibirNumeros() {
        System.out.println(numeros);
    }

    @Override
    public String toString() {
        return "SomaNumeros {numeros = " + numeros + "}";
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
