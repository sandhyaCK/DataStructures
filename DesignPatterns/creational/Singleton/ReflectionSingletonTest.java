package com.bridgelabz.designPatterns;
import java.lang.reflect.Constructor;
public class ReflectionSingletonTest {
	public static void main(String[] args) {
		EagerInitializion instanceOne = EagerInitializion.getInstance();
		EagerInitializion instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializion.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializion) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}
