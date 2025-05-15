package list.OperacoesBasicas;

import list.Item;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    private List<Item> itemList;

    public CarrinhoDeCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome,Double preco,Integer qtd){
        itemList.add(new Item(nome,preco,qtd));
    }

    public void removerItem(String nome){
        List<Item> itensRemover = new ArrayList<>();
        for(Item i: itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensRemover.add(i);
            }
        }
        itemList.removeAll(itensRemover);
    }


    public Double calcularValorTotal(){
        double total = 0.0;
        for(Item i: itemList){
            total += i.getPreco() * i.getQtd();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

}
