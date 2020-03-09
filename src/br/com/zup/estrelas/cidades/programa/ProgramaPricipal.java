package br.com.zup.estrelas.cidades.programa;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.zup.estrelas.cidades.factory.ConnectionFactory;

public class ProgramaPricipal {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = new ConnectionFactory().getConnection();
		
		System.out.println("Conectado!");
		conn.close();
	}

}
