package az.demo.ls.factory;

import az.demo.ls.buttons.Button;
import az.demo.ls.buttons.WindowsButton;

/**
 * Dialog based on Operating System
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
