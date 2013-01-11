package org.vaadin.addons.confirmwindow;

import com.vaadin.ui.Button;
import com.vaadin.ui.Window;

/**
 * Defines all the possible events that can happen on the {@link ConfirmWindow}.
 *
 * @author Ondrej Kvasnovsky
 */
public interface DecisionListener {

    void yes(Button.ClickEvent event);

    void no(Button.ClickEvent event);

    void cancel(Button.ClickEvent event);

    void close(Window.CloseEvent event);

}
