package p1;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class MyChangeListener implements ChangeListener {

	@Override
	public void changed(ObservableValue observable, Object oldValue, Object newValue) {
		System.out.println(newValue);
	}


}
