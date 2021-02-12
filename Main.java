import lib.ADT_LIFO;
import lib.Element;
import lib.LIFO_Array;

public class Main {
	public static void main(String[] args) {
		ADT_LIFO LIFO_Schlange = new LIFO_Array();
		System.out.println("Array_LIFO wird erstellt");

		String[] elemente = { "111", "222", "333", "444", "555" };
		for (String inhalt : elemente) {
			Element element = new Element(inhalt);
			LIFO_Schlange.einfügen(element);
			System.out.println("Neues element mit Inhalt " + inhalt + " wurde zum archivieren erstellt");
		}

		while (!LIFO_Schlange.istLeer()) {
			Element element = LIFO_Schlange.entfernen();
			String inhalt = element.inhalt;
			System.out.println("Element mit Inhalt " + inhalt + " kommt aus der Schlange und wurde archviert");
		}

		if (LIFO_Schlange.istLeer()) {
			System.out.println("Elemente entfernt. Akten archiviert. Die LIFO_Schlange funktioniert!");
		}
	}
}