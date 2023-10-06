package ch.makery.address.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Класс-модель для адресата (Person).
 *
 * @author Marco Jakob
 */
public class Person {

	private final StringProperty instument;
	private final StringProperty actia;;
	private final StringProperty obligation;
	private final IntegerProperty tiker;

	/**
	 * Конструктор по умолчанию.
	 */
	public Person() {
		this(null, null);
	}
	
	/**
	 * Конструктор с некоторыми начальными данными.
	 * 
	 * @param instumentT
	 * @param actiaA
	 */
	public Person(String instumentT, String actiaA) {
		this.instument = new SimpleStringProperty(instumentT);
		this.actia = new SimpleStringProperty(actiaA);
		
		// Какие-то фиктивные начальные данные для удобства тестирования.
		this.obligation = new SimpleStringProperty("облигация");
		this.tiker = new SimpleIntegerProperty(1234);
	}
	
	public String getinstument() {
		return instument.get();
	}

	public void setinstument(String instumentT) {
		this.instument.set(instumentT);
	}
	
	public StringProperty instumentProperty() {
		return instument;
	}

	public String getactia() {
		return actia.get();
	}

	public void setactia(String actiaA) {
		this.actia.set(actiaA);
	}
	
	public StringProperty actiaProperty() {
		return actia;
	}

	public String getobligation() {
		return obligation.get();
	}

	public void setobligation(String obli) {
		this.obligation.set(obli);
	}
	
	public StringProperty obligationProperty() {
		return obligation;
	}

	public int gettiker() {
		return tiker.get();
	}

	public void settiker(int tik) {
		this.tiker.set(tik);
	}
	
	public IntegerProperty tikerProperty() {
		return tiker;
	}
}
