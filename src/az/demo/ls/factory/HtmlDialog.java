package az.demo.ls.factory;

import az.demo.ls.buttons.Button;
import az.demo.ls.buttons.HtmlButton;

/**
 * HTML-dialog.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
