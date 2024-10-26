import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowsDialog;

public class Main {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure(){
        if(System.getProperty("os.name").equals("Windows 11")){
            dialog = new WindowsDialog();
        }
        else{
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.renderWindow(); // 윈도우 또는 HTML 다이얼로그를 띄운다. 구체적인 다이얼로그는 구현체에 의해 결정됨.
    }
}