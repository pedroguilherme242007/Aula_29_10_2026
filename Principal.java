package Aula_29_10_2026;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("João da Silva", "(11) 9999-9999");
		System.out.println("Pessoa:");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());
		
		PessoaFisica pessoafisica = new PessoaFisica("João da Silva", "(11) 9999-9999", "123.456.789.00", "300.456.989-x");
		System.out.println("\nPessoa fisica: ");
		System.out.println("Nome: " + pessoafisica.getNome());
		System.out.println("Telefone: " + pessoafisica.getTelefone());
		System.out.println("CPF: " + pessoafisica.getCpf());
		System.out.println("RG: " + pessoafisica.getRg());
		
		PessoaJuridica pessoajuridica = new PessoaJuridica("Empresa XYZ", "(11) 9999-9999", "12.345.678/9001-23");
		System.out.println("\nPessoa Juridica:");
		System.out.println("Nome: " + pessoajuridica.getNome());
		System.out.println("Telefone: " + pessoajuridica.getTelefone());
		System.out.println("CNPJ: " + pessoajuridica.getCnpj());
	}
}
