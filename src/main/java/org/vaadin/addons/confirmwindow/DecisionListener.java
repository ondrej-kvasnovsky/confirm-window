package org.vaadin.addons.confirmwindow;

/**
 * Defines all the possible events that can happen on the {@link ConfirmWindow}.
 *
 * @author Ondrej Kvasnovsky
 */
public interface DecisionListener {

    void yes(ConfirmEvent event);

    void no(ConfirmEvent event);

    void cancel(ConfirmEvent event);

    void close(ConfirmEvent event);

}
