package org.azalea.test.jiance;

public class NoBug {
	
	@JianCe
	public void jiafa(){
		System.out.println("1+1="+(1+1));
	}
	@JianCe
	public void jianfa(){
		System.out.println("1-1="+(1-1));
	}
	@JianCe
	public void chufa(){
		System.out.println("1/0="+(1/0));
	}
	
}
