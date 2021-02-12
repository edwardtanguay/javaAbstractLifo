package lib;

public class LIFO_Array extends ADT_LIFO {
	Element[] q = null;

	public LIFO_Array() {
		this.neueSchlange();
	}

	public void neueSchlange() {
		q = new Element[100];
	}

	public void einfügen(Element e) {
		if (this.istLeer()) {
			q[0] = e;
		} else {
			for (int i = 0; i < 100; i++) {
				if (q[i] == null) {
					q[i] = e;
					break;
				}
			}
		}
	}

	private int getLastIndexNotNull() {
		for (int i = 0; i < 99; i++) {
			if(q[i] == null) {
				return i - 1;
			}
		}
		return 0;
	}

	public Element entfernen() {
		Element e = new Element();
		if (this.istLeer()) {
			System.out.println("Die Schlange ist leer, nichts kann entfernt werden.");
		} else {
			// int lastIndexNotNull = this.getLastIndexNotNull();
			for (int i = 99; i >= 0; i--) {
				if (q[i] != null) {
					e = q[i];
					q[i] = null;
					return e;
				}
			}
		}
		return null;
	}

	public boolean istLeer() {
		boolean erg;
		if (q[0] == null) {
			erg = true;
		} else {
			erg = false;
		}
		return erg;
	}
}