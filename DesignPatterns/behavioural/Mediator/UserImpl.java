package com.bridgelabz.behavioural;

public class UserImpl  extends User{

	public UserImpl(ChatMediator med, String name) {
		super(med, name);
		
	}
	public void send(String msg) {
		System.out.println(this.name +" " +"Sending message" +" " +msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name+ " " +"Receiving message"+" " +msg);
	}
	

}
