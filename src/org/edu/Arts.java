package org.edu;

//child class
//D CLass








public class Arts extends Education {

	@Override
	public void bSc() {
		System.out.println("Course---------->Bsc");
		
	}

	@Override
	public void bEd() {
		System.out.println("Course---------->B.Ed");
		
	}

	@Override
	public void bA() {
		System.out.println("Course---------->BA");
		
	}

	@Override
	public void bBA() {
		System.out.println("Course---------->BBA");
		
	}

	@Override
	public void ug() {
		System.out.println("UG---------->Bsc \n B.Ed \n BA \n BBA");
		
	}

	@Override
	public void pg() {
		System.out.println("PG---------->MBA \n M.com \n M.E");
		
	}
	
	public static void main(String[] args) {
		Arts as = new Arts();
		as.bSc();
		as.bEd();
		as.bA();
		as.bBA();
		as.ug();
		as.pg();
	}

}
