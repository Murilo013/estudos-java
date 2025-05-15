package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listNumeros;

    public SomaNumeros() {this.listNumeros = new ArrayList<>();}

    public void adicionarNumero(int numero){
        listNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer i: listNumeros){
            soma += i;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = listNumeros.get(0);
        for(Integer i : listNumeros){
            if(i > maior){
                maior = i;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = listNumeros.get(0);
        for(Integer i : listNumeros){
            if(i < menor){
                menor = i;
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        System.out.println(listNumeros);
    }


}
