package Comportamentos;

public class garbageCollector_escopoLocal {
	
	public static void main(String[] args) {
		/*
		 
		 GARBAGE COLLECTOR:
		 
		 É um processo que automatiza o gerenciamento de memória de um programa em execução
		 
		 O garbage collect monitora os objetos alocados dinamicamente pelo programa (no heap), desalocando aqueles que não estão mais sendo utilizados.
		 
		 Desalocação por garbage collector
		 
		 Product p1, p2;
		 
		 p1 = new Product("TV", 900.00, 0);
		 
		 p2 = new Product("Mouse", 30.00, 0);
		 
		 [p1 = p2]
		 
		 
		 
		 Desalocação por escopo
		 
		 void method1() {
		 	int x = 10;
		 	if(x > 0) {
		 		int y = 20;
		 	}
		 	System.out.println(x);
		 }
		 
		 outro exemplo
		 
		 void method1(){^
		 	Product p = method2();
		 	System.out.println(p.Name);
		 }
		 
		 Product method2(){
		 	Product prod = new Product("TV", 900.0, 0);
		 	return prod;
		 }
		 
		 RESUMO:
		 
		 *Objetos alocados dinamicamente, quando não possuem mais referência para eles, serão desalocados pelo garbage collector
		 
		 *Variáveis locais são desalocadas imediatamente assim que seu escopo local sai de execução
		 */
	}

}
