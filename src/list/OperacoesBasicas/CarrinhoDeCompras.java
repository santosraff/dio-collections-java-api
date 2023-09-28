package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        if (!itemList.isEmpty()) {
            for (Item i : itensParaRemover)
                if (i.getNome().equalsIgnoreCase(nome))
                    itensParaRemover.add(i);
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getQuantidade() * item.getQuantidade();
                valorTotal += valorItem;
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        return valorTotal;
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
          } else {
            System.out.println("A lista está vazia!");
          }
        }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [itemList = " + itemList + "]";
    }
}
