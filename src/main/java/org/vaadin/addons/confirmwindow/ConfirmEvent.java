package org.vaadin.addons.confirmwindow;

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;

/**
 * @author Ondrej Kvasnovsky
 */
public class ConfirmEvent {

    Button.ClickEvent clickEvent;
    Component.Event closeEvent;

    public ConfirmEvent(Button.ClickEvent clickEvent) {
        this.clickEvent = clickEvent;
    }

    public ConfirmEvent(Component.Event closeEvent) {
        this.closeEvent = closeEvent;
    }

    public Button.ClickEvent getClickEvent() {
        return clickEvent;
    }

    public void setClickEvent(Button.ClickEvent clickEvent) {
        this.clickEvent = clickEvent;
    }

    public Component.Event getCloseEvent() {
        return closeEvent;
    }

    public void setCloseEvent(Component.Event closeEvent) {
        this.closeEvent = closeEvent;
    }
}
