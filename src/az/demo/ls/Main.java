package az.demo.ls;

import az.demo.ls.factory.Dialog;
import az.demo.ls.factory.HtmlDialog;
import az.demo.ls.factory.WindowsDialog;

public class Main {


    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * Application creates a certain factory depending on configuration or environment.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * The rest of the client code works with factory and products only
     * through general interface, because of that it does not matter
     * afterwards which factory was created beforehand.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
