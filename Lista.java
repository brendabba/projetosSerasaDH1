package projetoLista1;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//QUESTÃO 1 (ACRESCENTAR 10% DO GRAÇOM):
		
		double contaRefeicao = 55.00;
		float garcom = 0.1f;
		
		System.out.println("Resposta da questão 1: R$" + (contaRefeicao + (contaRefeicao * garcom)));
		
		//QUESTÃO 2 (RESTO DA DIV):
		
		int valor1 = 45;
		int valor2 = 12;
		
		System.out.println("Resposta da questão 2: " + (valor1 % valor2));
		
		//QUESTÃO 3 (DESCONTO À VISTA):
		
		double valorMercadoria = 300.00;
		float descontoAVista = 0.15f;
		String pagamentoAVista = "Sim";
		
		if (pagamentoAVista == "Sim"){
			System.out.println("Resposta da questão 3: R$" + (valorMercadoria - (valorMercadoria * descontoAVista)));
		}else {
			System.out.println("Resposta da questão 3: Pagamento não foi à vista então --> R$" + valorMercadoria);
		}
		
		//QUESTÃO 4 (TROCO): 
		
		double valorDaMercadoria = 750.00;
		double valorPago = 900.00;
		
		System.out.println("Resposta da questão 4: R$" + (valorPago - valorDaMercadoria));
		
		//QUESTÃO 5 (INFORMAR O MAIOR E O MENOR VALOR):
		
		int numeros[] = {442, 590, 893};
		int maior = 0, menor = Integer.MAX_VALUE;
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		for(int j = 0; j < numeros.length; j++) {
			if(numeros[j] < menor) {
				menor = numeros[j];
			}
		}
		System.out.println("Resposta da questão 5: " + (" Maior número -> " + maior) + ("; Menor número -> " + menor));
		
		//QUESTÃO 6 (ESC. O NOME DO FUNCIONÁRIO):
		
		int matricula = 00001;
		String nomeFuncionario = "Maria Celina do Céu";
		int idade = 24;
		String sexo = "Feminino";
		String endereco = "Rua dos Bobos, nº 0, Centro, Itagimirim/BA.";
		String bairro = "Centro";
		String estadoCivil = "Casada";
		
		System.out.println("Resposta da questão 6: " + nomeFuncionario);
		
		//QUESTÃO 7 (SOMA):
		
		int numero01 = 350;
		int numero02 = 250;
		
		System.out.println("Resposta da questão 7: " + (numero01 + numero02));
		
		//QUESTÃO 8 (NOME E MÉDIA):
		

	    String nome = "Ayô do Céu";
	    float n1 = 9.5f;
	    float n2 = 10f;
	    float n3 = 10f;

	    System.out.println(("Resposta da questão 8: Nome da Aluna(o) -> " + nome) + (n1 + n2 + n3)/3);

	    //QUESTÃO 9 (ABONO DE 10%):

	    String nomeDoFuncionario = "Brenda do Céu";
	    String departamento = "Desenvolvimento";
	    double salario = 3000.00;
	    float abono = 0.1f;

	    System.out.println(("Resposta da questão 9: Haverá um abono de 10% acrescido sobre o salário de " + nomeDoFuncionario) + (" R$" + salario * abono));

      	//QUESTÃO 10 (PREÇO, PERCENTUAL DE LUCRO, PREÇO DA VENDA, QUANTIDADE E PREÇO TOTAL):

	    int codigo = 0001;
	    String descricao = "Pacote inicial de artes para redes sociais.";
	    int quantidade = 10;
	    double precoDeCompra = 50.00;
	    float lucro = 4.0f;
	    double precoDeVenda = precoDeCompra * lucro;
	    double precoTotal = precoDeVenda * quantidade;

	    System.out.println("Resposta da questão 10: " + ("Preço de compra: " + "R$"+ precoDeCompra) +("; Lucro: " + (lucro * 100) + "%") + ("; Preço da venda: " + "R$" + precoDeVenda) + ("; Quantidade: " + quantidade) + ("; Preço total: " + "R$" + precoTotal));

	    //QUESTÃO 11 (CALCULAR E INFORMAR IDADE)
	    
	    String nome1 = "Maria Dos Anjos";
	    int anoNascimento = 1997;
	    int mesNascimento = 3;
	    int diaNascimento = 17;
	    
	    int anoAtual = 2022;
	    int mesAtual = 4;
	    int diaAtual = 20;
	    
	    if ((mesAtual > mesNascimento) || (mesAtual == mesNascimento && diaAtual >= diaNascimento)){
	    	idade = anoAtual - anoNascimento;
	    }else {
	    	idade = anoAtual - anoNascimento -1;
	    }
	    
	    System.out.println("Resposta da questão 11: " + idade + " anos");
	    
	    //QUESTÃO 12 (A SEJA 3, B SEJA Q E C SEJA 2)
	    
	    int A = 1;
	    int B = 2;
	    int C = 3;
	    
	    A = 3;
	    B = 1;
	    C = 2;
	    
	    System.out.println("Resposta da questão 12: " + ("A= " + A) + ("; B= " + B) + ("; C= " + C));
	    
		//QUESTÃO 13 (SALÁRIO BRUTO E LÍQUIDO)
	    
	    double salarioBase = 2000.00;
	    int numeroDependentes = 3;
	    float descontoInss = 0.1f;
	    double salarioBruto = salarioBase + (100 * numeroDependentes);
	    double salarioLiquido = (salarioBase - (salarioBase * descontoInss) + (100 * numeroDependentes));
	   
	    System.out.println("Resposta da questão 13: " + ("Salário-bruto = R$" + salarioBruto) + ("; Salário-líquido: R$" + salarioLiquido));
	    
	    //QUESTÃO 14 (QUANTIDADE NECESSÁRIA DE TINTA E NÚMERO DE LATAS)
	    
	    float largura = 4.5f;
	    float altura = 2.0f;
	    float metrosQuadrados = largura * altura;
	    float quantidadeTinta = 3 * metrosQuadrados;
	    float quantidadeLatas = quantidadeTinta / 2;
	    
	    System.out.println("Resposta da questão 14: " + ("Quantidade de tinta = " + quantidadeTinta) + (" ; Quantidade de latas = " + quantidadeLatas));
	    
	    //QUESTÃO 15 (IMPRIMA AS EXPRESSÕES)
	    
	    int a = 5;
	    int b = 8;
	    int c  = 10;
	    
	    int x = a + (2 * b)/(c - 6);
	    int y = x * a;
	    
	    System.out.println("Resposta da questão 15: " + ("X= " + x) + ("; Y= " + y));
	    
	    //QUESTÃO 16 (EXCESSO DE PESO)
	    
	    int pesoBagagem = 35;
	    
	    if (pesoBagagem > 40) {
	    	System.out.println("Resposta da questão 16: R$10.000,00");
	    }else if (pesoBagagem <= 20){
	    	System.out.println("Resposta da questão 16: R$0,00");
	    }else {
	    	System.out.println("Resposta da questão 16: R$5.000,00");
	    }
	    
	    //QUESTÃO 17 (PESO IDEAL)
	    
	    boolean feminino = true;
	    
	    float alturaPessoa = 1.80f;
	    
	    float pesoIdealMasculino = (72.7f * alturaPessoa) - 58f;
	    float pesoIdealFeminino = (62.1f * alturaPessoa) - 44.7f;
	    
	    if(feminino = true) {
	    	System.out.println("Resposta da questão 17: " + pesoIdealFeminino + "Kg");
	    } else {
	    	System.out.println("Resposta da questão 17: " + pesoIdealMasculino + "Kg");
	    }
	    
	    //QUESTÃO 18 (CATEGORIA DO NADADOR)
	    
	   int idadeNadador = 16;
	   String categoria;
	   
	   if(idadeNadador > 18) {
		   categoria = "Sênior";
	    }else if (idadeNadador >= 5 && idadeNadador <= 7){
	    	categoria = "Infantil A";
	    }else if (idadeNadador >= 8 && idadeNadador <= 10){
	    	categoria = "Infantil B";
	    }else if (idadeNadador >= 11 && idadeNadador <= 13){
	    	categoria = "Juvenil A";
	    }else {
	    	categoria = "Juvenil B";
	    }
	   
	   System.out.println("Resposta da questão 18: " + ("Categoria = " + categoria));

	}

}
