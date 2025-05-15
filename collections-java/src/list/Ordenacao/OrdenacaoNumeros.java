package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{

    private List<Integer> listNumeros;

    public OrdenacaoNumeros() {this.listNumeros = new ArrayList<>();}


    public void adicionarNumero(int numero){
        listNumeros.add(numero);
    }

    public void ordenarAscendente(){
        Collections.sort(listNumeros);
        System.out.println(listNumeros);
    }

    public void ordenarCrescente(){
        listNumeros.sort(Collections.reverseOrder());
        System.out.println(listNumeros);
    }


}
