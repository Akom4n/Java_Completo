package Comportamentos;

public class Listas {
	
	public static void main(String[] args) {
		
		/*
		 * LISTAS:
		  
		 * Lista é uma estrutura de dados:
		    Homogênea (dados do mesmo tipo)
		    Ordenada (elementos acessados por meio de posições)
		    Inicia vazia, e seus elementos são alocados sob demanda
		    Cada elemento ocupa um "nó" (ou nodo) da lista
		    
		 * Tipo (interface): List
		 * Classes que implementam arrayList, LinkedList, etc.
		  
		 * Vantagens:
		  	Tamanho variável
		  	Facilidade para se realizar inserções e deleções
		  	
		 * Desvantagens:
		 	Acesso sequencial aos elementos * (dependendo da implementação da lista ela é otimizada)
		 	
		 	
		 	ex: myList
		 	
		 	(0 = 1.72) > (1 = 1.56) > (2 = 1.80)
		 	
		 	
		 	Demonstração:
		 	
		 	Tamanho da lista: size()
		 	
		 	Inserir elemento na lista: add(obj), add(int, obj)
		 	
		 	Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
		 	
		 	Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
		 	
		 	Filtrar lista com base em predicado: List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
		 	
		 	Encontrar primeira ocorrência com base em predicado: Integer result = list.stream()filter(x -> x > 4).findFirst().orElse(null);
		 	
		 	
		 */
	}

}
