import java.util.ArrayList;
import java.util.List;
public class TestandoLista {
	public static void main(String[] args) {
		ArrayList<String> listaDeCompras = new ArrayList<>();
		//Perceba que a classe String supracitada funciona como um wrapper(empacotador)
		listaDeCompras.add("Arroz");
		listaDeCompras.add("Feijão");
		listaDeCompras.add("Farinha");
		listaDeCompras.add("Verduras");
		System.out.println(listaDeCompras.get(1));
		listaDeCompras.remove(1);
		System.out.println(listaDeCompras.get(1));
	}
}
