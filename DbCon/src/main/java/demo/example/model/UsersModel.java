package demo.example.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import demo.example.config.DBConfig;
import demo.example.entity.Entity;

public class UsersModel {
	public List<Entity> listuser(){
		List<Entity> listusers=new ArrayList<Entity>();
		Connection connect=DBConfig.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		
		String query="Select * from users";
		try {
			stmt=connect.createStatement();
			rs= stmt.executeQuery(query);
			while(rs.next()) {
				listusers.add(new Entity(rs.getInt("id"),rs.getString("Name"),rs.getString("email")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listusers;
		
	}

}
