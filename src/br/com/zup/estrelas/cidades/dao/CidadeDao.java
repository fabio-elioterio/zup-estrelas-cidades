package br.com.zup.estrelas.cidades.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.zup.estrelas.cidades.factory.ConnectionFactory;

public class CidadeDao {

	private static final int DATA_DE_FUNDACAO = 7;
	private static final int RENDA_PER_CAPITA = 6;
	private static final int ESTADO = 5;
	private static final int CAPITAL = 4;
	private static final int NUMERO_DE_HABITANTES = 3;
	private static final int NOME = 2;
	private static final int CEP = 1;
	Connection conn = new ConnectionFactory().getConnection();

	public boolean insercaoCidade() throws SQLException {

		String sql = "insert into cidade"
				+ "(cep, nome, nro_habitantes, capital, estado, renda_per_capita, data_fundacao)"
				+ "values (?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setInt(CEP, 3400000);
		stmt.setString(NOME, "Toronto");
		stmt.setInt(NUMERO_DE_HABITANTES, 3000000);
		stmt.setBoolean(CAPITAL, false);
		stmt.setString(ESTADO, "sp");
		stmt.setDouble(RENDA_PER_CAPITA, 4500);
		stmt.setString(DATA_DE_FUNDACAO, "1793-07-29");

		stmt.execute();
		stmt.close();
		return true;

	}

}
