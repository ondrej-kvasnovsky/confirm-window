package org.vaadin.addons.confirmwindow;

/**
 * Default implementation of {@link DecisionListener}.
 *
 * @author Ondrej Kvasnovsky
 */
public abstract class AbstractDecisionListener implements DecisionListener {

    @Override
    public void yes(ConfirmEvent event) {
    }

    @Override
    public void no(ConfirmEvent event) {
    }

    @Override
    public void cancel(ConfirmEvent event) {
    }

    @Override
    public void close(ConfirmEvent event) {
    }
}
