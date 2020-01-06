package com.bridgelabz.designPatterns;

public class LazyInitialitation {
	 private static LazyInitialitation instance;
	    
	    private LazyInitialitation(){}
	    
	    public static LazyInitialitation getInstance(){
	        if(instance == null){
	            instance = new LazyInitialitation();
	        }
	        return instance;
	    }
	
}
