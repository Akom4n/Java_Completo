package Data_Hora;

public class Conceitos_Data {
	
	public static void main(String[] args) {
		
		/*
		 * Data-[hora] local: ano-mês-dia-[hora] sem fuso horário [hora] opcional]
		  
		 * Data-hora global: ano-mês-dia-hora com fuso horário
		  
		 * Duração: tempo decorrido entre duas datas-horas
		  
		 * QUANDO USAR?
		  
		 * Data-[hora] local:
		 	Quando o momento exato não interessa a pessoas de outro fuso horário.
		 	Uso comum: sistemas de região única, Excel.
		 		Data de nascimento: "15/06/2001"
		 		Data-hora da venda: "13/08/2022 às 15:32" (Presumindo não interessar no fuso horário)
		 		
		 * Data-hora global:
		 	Quando o momento exato interessa a pessoas de outro fuso horário.
		 	Uso comum: sistemas multi-região, web.
		 		Quando será o sorteio? "21/08/2022 às 20h (horário de São Paulo)"
		 		Quando o comentário foi postado? "há 17 minutos"
		 		Quando foi realizada a venda? "13/08/2022 às 15:32 (horário de São Paulo)"
		 		Início e fim do evento? "21/08/2022 às 14h até 16h (horário de São Paulo)"
		 		
		 		
		 		
		   TIMEZONE
		  	
		  	GMT - Greenwich Mean Time:
		  		Horário de Londres
		  		Horário do padrão UTC - Coordinated Universal Time
		  		Também chamado de "Z" time, ou Zulu time
		  		
		  	Outros fuso horário são relativos ao GMT/UTC:
		  		São Paulo: GMT-3
		  		Manaus: GMT-4
		  		Portugal: GMT+1
		  		
		  	Muitas linguagens/tecnologias usam nomes para as timezones:
		  		"US/Pacific"
		  		"America/Sao_Paulo"
		  		etc.
		 */
	}
	
}
