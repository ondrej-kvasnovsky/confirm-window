package org.vaadin.addons.confirmwindow;

import com.vaadin.ui.Button;
import com.vaadin.ui.Window;

/**
 * Default implementation of {@link DecisionListener}.
 *
 * @author Ondrej Kvasnovsky
 */
public abstract class AbstractDecisionListener implements DecisionListener {

    @Override
    public void yes(Button.ClickEvent event) {
    }

    @Override
    public void no(Button.ClickEvent event) {
    }

    @Override
    public void cancel(Button.ClickEvent event) {
    }

    @Override
    public void close(Window.CloseEvent event) {
    }
}
