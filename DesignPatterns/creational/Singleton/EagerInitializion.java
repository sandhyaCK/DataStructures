package com.bridgelabz.designPatterns;

public class EagerInitializion {

	    private static final EagerInitializion instance = new EagerInitializion();
	    
	    private void EagerInitialization(){}

	    public static EagerInitializion getInstance(){
	        return instance;
	    }
	}

