package com.mitocode.dao;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.mitocode.beans.Marca;
import java.sql.PreparedStatement;

public class DAOMarcaImpl implements DAOMarca{

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	@Override
	public void registrar(Marca marca) throws Exception {
		String sql = "INSERT INTO marca (id,nombre) values (?,?)";
		Connection con = null;
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, marca.getId());
			ps.setString(2, marca.getNombre());
			ps.executeUpdate();
			ps.close();
		}catch(Exception e){
			
		}finally {
			
		}
		
	}

	
}
