package com.bridgelabz.Structural;
import com.bridgelabz.Structural.*;
public class CommandExecutorProxyTeat {
	public static void main(String[] args) {
CommandExecutor exec= new CommandExecutorProxy("Sandhya","Wrong_password");
try {
exec.runCommand("ls");
exec.runCommand("rm -rf abc.pdf");
}
catch(Exception e) {
	System.out.println(e.getMessage());
}
}
}