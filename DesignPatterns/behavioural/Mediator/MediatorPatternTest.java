package com.bridgelabz.behavioural;

public class MediatorPatternTest {
	public static void main(String[] args) {
ChatMediator mediator = new ChatMediatorImpl();
User u1 = new UserImpl( mediator,"Sandhya");
User u2= new UserImpl(mediator,"Shashi");
User u3= new UserImpl(mediator,"Manju");
mediator.addUser(u1);
mediator.addUser(u2);
mediator.addUser(u3);
u1.send("hai all");

	}
}
