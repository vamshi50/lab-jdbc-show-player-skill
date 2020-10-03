package controller;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import dao.SkillDAO;
import model.Skill;

public class Main
{
	
	
	public static void main(String[] args)
	{
		SkillDAO sdo = new SkillDAO();
		Skill skill = new Skill(34,"developer");
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		System .out.println("Enter skill id:");
		long skillId =skill.getSkillId(); 
		System.out.println("Enter skill Name");
		String skillname=skill.getSkillName();
		System.out.println("List of Skills:");
		
		System.out.println("\nskill Id:"+skillId +"\nskill Name:"+skillname);
		
		//List<Skill> skill =  sdo.listAllSkills();
		//for (Skill skill3 : skill) {
		//	System.out.println(skill3.getSkilld()+")"+ " "+skill3.getSkillName());
		
		}
	}
	