package explicacao; //Pacote da classe

public class ProgramacaoOrientada { //Nome da classe
	
	/*
	 * Discussão:
	 * 
	 * Triangulo é uma entidade com três atributos: a, b, c.
	 * 
	 * Estamos usando três variáveis distintas para representar cada triângulo:
	 * 
	 * double aX, bX, cX, aY, bY, cY;
	 * 
	 * Para melhorar isso, vamos usar uma CLASSE para representar um triângulo.
	 * 
	 * Objetos:São instâncias da classe
	 * Classe: é a definição do tipo.
	 * 
	 * É um tipo estruturado que pode conter(membros): Atributos (dados/campos)
	 * Métodos (Funções/operações)
	 * 
	 * A classe também pode provar muitos outros recursos, tais como: Construtores
	 * Sobrecargas Encapsulamento Herança Polimorfismo
	 * 
	 * Exemplos: Entidades: Produto, Cliente, Triangulo Serviços: ProdutoService,
	 * ClienteService, EmailService, StorageService Controladores:
	 * ProdutoController, ClienteController Utilitários: Calculadora, Compactador
	 * Outros(views, repositórios, gerenciadores, etc.)
	 *
	 * 
	 */
	
	//O prefixo "public" indica que o atributo ou método pode ser usado em outros arquivos
		public double a;
		public double b; //Atributos de classe
		public double c;
		
		/*
		 * Discussão 2:
		 * 
		 * Com o uso da CLASSE, agora nós temos uma varável composta do tipo "Triangle" para representar cada triângulo:
		 * 
		 * Triangle x, y;
		 * x = new Triangle();
		 * y = new Triangle();
		 * 
		 * Agora vamos melhorar nossa CLASSE, acrescentando nela um MÉTODO para calcular a área.
		 */
		
		//Double é o tipo do dado que o método retorna(se o método não retorna nada, usa-se a palavra "void")
		//Area é o nome do método
		//o () representa a lista de parâmetros do método
		public double area() {
			double p = (a + b + c) / 2.0;
			return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Corpo do método
		}
		/*
		 * Discussão 3:
		 * 
		 * Quais são os benefícios de se calcular a área de um triângulo por meio de um MÉTODO dentro da CLASSE Triangle?
		 * 
		 * 1 - Reaproveitamento de código: nós eliminamos o código repetido (cálculo das áreas dos triângulos x e y) no programa principal.
		 * 
		 * 2 - Delegação de responsabilidades: quem deve ser responsável por saber como calcular a área de um triângulo é o próprio triângulo. A lógica do cálculo da área não deve estar em outro lugar.
		 */
		
		/*
		 * Discussão 4:
		 * 
		 * Toda classe em Java é uma subclasse da classe Object
		 * 
		 * Object possui os seguintes métodos:
		 *	getClass - Retorna o tipo do objeto
		 *	equals - compara se o objeto é igual a outro
		 *	hashCode - retorna um códiga hash do objetos
		 *	toString - converte o objeto  
		 *
		 *
		 */
		
		/* 
		 * Discussão 5:
		 * 
		 * No problema dos triângulos, cada triângulo possui sua área.
		 * 
		 * Area() é uma operação concernente ao objeto: cada triângulo possui sua área.
		 * 
		 * x >> 3.0(A) | 4.0(B) | 5.0(C) = (x.area() 6.0)
		 * 
		 * y >> 7.5(A) | 4.5(B) | 4.02(C) = (y.area() 7.5638)
		 * 
		 * Já no caso da calculadora, os valores dos cálculos não mudam para calculadoras diferentes, ou seja, são cálculos estáticos. O valor de Pi também é estático.
		 * 
		 * Calculator calc1 = new Calculator();
		 * Calculator calc2 = new Calculator();
		 * 
		 * calc1 >> 3.14[Pi] / calc1.PI(3.14) / calc1.circumference((3.0)18.85)
		 * 
		 * calc2 >> 3.1[Pi] / cacl2.PI(3.14) / calc2.circumference((3.0)18.85)
		 * 
		 */
		
		
		
		
	}

