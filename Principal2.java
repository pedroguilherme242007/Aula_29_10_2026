package Aula_29_10_2026;

public class Principal2 {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Neymar Junior", "987.654.321.00", 2000.00, "Faxineiro", "Limpeza");
		System.out.println("Funcionario:");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Cargo: " + funcionario.getCargo());
		System.out.println("Departamento: " + funcionario.getDepartamento());
		
		Atendente atendente = new Atendente("Cristiano Ronaldo", "123.456.789.00", 2200.00, "Atendente", "Vendas", 20.00);
		System.out.println("\nAtendente:");
		System.out.println("Nome: " + atendente.getNome());
		System.out.println("CPF: " + atendente.getCpf());
		System.out.println("Salario: " + atendente.getSalario());
		System.out.println("Cargo: " + atendente.getCargo());
		System.out.println("Departamento: " + atendente.getDepartamento());
		System.out.println("Ajuda de Custo: " + atendente.getAjudadeCusto());
		
		Gerente gerente = new Gerente("Lionel Messi", "987.654.321.00", 4000.00, "Gerente", "Gerência", "Todos", 4);
		System.out.println("\nGerente:");
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Salario: " + gerente.getSalario());
		System.out.println("Cargo: " + gerente.getCargo());
		System.out.println("Departamento: " + gerente.getDepartamento());
		System.out.println("Beneficios: " + gerente.getBeneficios());
		System.out.println("Premiação: " + gerente.getPremiacao());
	}

}
