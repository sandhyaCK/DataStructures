package com.bridgelabz.Structural;

import java.io.IOException;

public class CommandExecutorProxy  implements  CommandExecutor{
	@SuppressWarnings("unused")
	private CommandExecutor executor;
	private static boolean isAdmin ;
	public CommandExecutorProxy(String user ,String pwd ) {
		if("Sandhya".equals(user)&& "Saikrish@1".equals(pwd)); 
				isAdmin=true;
		 executor =new  CommandExecutorImpl();
	}
		public void runCommand(String cmd) throws Exception{
			if(isAdmin) {
				executor.runCommand(cmd);}
			else {
				if(cmd.trim().startsWith("rm")) {
					throw new Exception ("rm command is not allowed for non-Admin users");
					}
				else {
				executor.runCommand(cmd);
				}
			
			}
			}
		
	}


