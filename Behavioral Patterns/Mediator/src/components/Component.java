package components;

import mediator.Mediator;

public interface Component {
    void setMediator(Mediator meditator);
    String getName();
}
