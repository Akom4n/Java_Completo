package Comportamentos;

public class tiposRef_tiposVal {
	
	public static void main(String[] args) {
		
		/*
		 *CLASSES SÃO TIPOS REFERENCIA:
		 
		 Variáveis cujo tipo são classes não devem ser entendidas como caixas, mas sim "tentáculos" (ponteiros) para caixas
		 
		 Product 1, p2;
		 
		 p1 = new Product("TV", 900.00, 0);
		 
		 p2 = p1; //p2 passa a apontar para onde p1 aponta
		 
		 
		 
		 *VALOR "NULL":
		 
		 Tipos referência aceitam o valor "null", que indica que a variável aponta para ninguém.
		 
		 Product 1, p2;
		 
		 p1 = new Product("TV", 900.00, 0);
		 
		 p2 = null;
		 
		 
		 
		 *TIPOS PRIMITIVOS SÃO TIPOS VALOR:
		 
		 Em java, tipos primitivos são tipos valor. Tipos valor são CAIXAS e não ponteiros.
		 
		 double x, y;
		 
		 x = 10;
		 
		 y - x; // y recebe uma CÓPIA de x
		 
		 
		 
		 *TIPOS PRIMITIVOS E INICIALIZAÇÃO:
		 
		 °Demo:
		 
		 int p;
		 System.out.println(p); // erro: variável não iniciada
		 
		 p = 10;
		 System.out.println(p);
		 
		 
		 *VALORES PADRÃO:
		 
		 °Quando alocamos (new) qualquer tipo estruturado (classe ou array), são atribuídos valores padrão aos seus elementos
		 
		 	números:0
		 	boolean: false
		 	char: caractere código 0
		 	objeto: null
		 	
		  Product p = new Product();
		  
		 TIPOS REFERÊNCIA VS TIPO VALOR
		 
		 Classes			
		 
		 	Vantagem: usufrui de todos recursos OO
		 	Variáveis são ponteiros
		 	Objetos precisam ser instanciadas usando new, ou apontar para um objeto já existente.
		 	Aceita valor null
		 	Y = X; "Y passa a apontar para onde X aponta"
		 	Objetos instanciados no heap
		 	Objetos não utilizados são desalocados em um momento próximo pelo garbage collector
		 	
		 Tipo primitivo
		 	
		 	Vantagem: é mais simples e mais performático
		 	Variáveis são caixas
		 	Não instancia. Uma vez declarados, estão prontos para uso.
		 	Não aceita valor null
		 	Y = X; "Y recebe uma cópia de X"
		 	"Objetos" instanciados no stack
		 	"Objetos" são desalocados imediatamente quando seu escopo de execução é finalizado
		 */
	}

}
