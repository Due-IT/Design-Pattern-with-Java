package factory;

import buttons.Button;

public abstract class Dialog {
    public void renderWindow(){
        Button okButton = createButton(); //버튼객체를 생성한다. 구체적인 버튼은 구현체에 의해 결정됨.
        okButton.render(); //버튼을 화면에 띄운다. 구체적인 디자인이나 기능은 구현체에 의해 결정됨.
    }

    public abstract Button createButton();
}
