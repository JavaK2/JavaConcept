package ch03_oops.interfaces;

public class Excel implements Office {

	public void appNew(String fileName) {
		System.out.println("Word opening New file " + fileName);
	}

	public void appOpen(String fileName) {
		System.out.println("Word opening file " + fileName);
	}

	public void appSave(String fileName) {
		System.out.println("Word saving file " + fileName);
	}

}
