package az.demo.ls.factory;

import az.demo.ls.buttons.Button;

/**
 * Factory's base class. Factory is just an extra role for the class.
 * It already has some business logic, which requires creation of different products.
 */
public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will implement this method to create product instances,
     * different for each factory.
     */
    public abstract Button createButton();
}
