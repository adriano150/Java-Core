package revisao;

public class teste {

	public static void main(String[] args) {
		Agenda minhaAgenda = new Agenda(null, null);
		
		
		minhaAgenda.setNome("Adriano");
		minhaAgenda.setTelefone("12345-67890");
		minhaAgenda.addEmail("eu@email.com");
		minhaAgenda.setEndereco("Rua Cracolândia");
		
		System.out.println(minhaAgenda.getNome()+ "\n" + minhaAgenda.getTelefone() + "\n"
		+ minhaAgenda.getEmail() + "\n" + minhaAgenda.getEndereco());
	}

}