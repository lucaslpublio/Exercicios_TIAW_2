package com.ti2cc;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		Usuario usuario = new Usuario(11, "Lucas", "Lucas",'0000');
		if(dao.inserirUsuario(usuario) == true) {
			System.out.println("Inserção com sucesso -> " + usuario.toString());
		}

		//Atualizar usuário
		usuario.setSenha("nova senha");
		dao.atualizarUsuario(usuario);
		
		//Excluir usuário
		dao.excluirUsuario(usuario.getCodigo());
		
		//Mostrar usuários
		usuarios = dao.getUsuarios();
		System.out.println("==== Mostrar usuários === ");		
		for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
		}
		
		dao.close();
	}
}
