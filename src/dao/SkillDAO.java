package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO
{
	public List< Skill > listAllSkills()
	{
		ArrayList<Skill> skills = new ArrayList<Skill>();
	   Skill skill = null;
	   ConnectionManager cn = new ConnectionManager();
	   try
	   {
		   String sql = "SELECT ID,NAME FROM SKILL ORDER BY NAME ASC";
		   Statement stm = ConnectionManager().getConnection().createStatement();
		   ResultSet rt = stm.executeQuery(sql);
		   while(rt.next())
		   {
			   int id = rt.getInt("id");
			   String st = rt.getString("Name");
			   skill = new Skill(id, st);
			   skills.add(skill);
		   }
		   
		   rt.close();
	   }
	   catch (Exception e) {
	        System.out.println(e);
	    }
	   
	   return skills;
	   
	   
	}

	private Statement ConnectionManager() {
		// TODO Auto-generated method stub
		return null;
	}
}
