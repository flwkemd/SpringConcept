package com.ex.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// add new fields for email and team
	private String email;
	private String team;

	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach : inside no-arg constructor");
	}

	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside setter method - setFortune");
		this.fortuneService = fortuneService;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach : inside setter method - setEmail");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside setter method - setTeam");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice!";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
