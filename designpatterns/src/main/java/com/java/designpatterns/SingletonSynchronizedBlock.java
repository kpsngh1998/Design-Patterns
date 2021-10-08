package com.java.designpatterns;

public class SingletonSynchronizedBlock {

	private static SingletonSynchronizedBlock instance;
	
	private SingletonSynchronizedBlock() {};
	
	public static SingletonSynchronizedBlock getInstance(){
		if(instance == null){
			
			synchronized (SingletonSynchronizedBlock.class) {
				instance = new SingletonSynchronizedBlock();
			}

		}
		
		return instance;
	}
}
