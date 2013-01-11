package org.vaadin.addons.confirmwindow;

import com.vaadin.event.ShortcutAction;
import com.vaadin.event.ShortcutListener;
import com.vaadin.ui.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents confirm window. Default setup is:
 * <li> modal
 * <li> centered
 * <li> fixed size
 * <li> not resizable window
 * <p/>
 * TODO: add support for cancel button (if needed ask me to do that please)
 *
 * @author Ondrej Kvasnovsky
 */
public class ConfirmWindow extends Window {

    List<DecisionListener> decisionListeners = new ArrayList<DecisionListener>();
    Button btnYes = new Button();
    Button btnNo = new Button();
    Button btnCancel = new Button();

    VerticalLayout layout = new VerticalLayout();
    HorizontalLayout buttonsLayout = new HorizontalLayout();

    ConfirmWindow(String caption, String question, String yes, String no) {
        setCaption(caption);
        btnYes.setCaption(yes);
        btnYes.focus();
        btnNo.setCaption(no);
        setModal(true);
        center();

        buttonsLayout.addComponent(btnYes);
        buttonsLayout.setComponentAlignment(btnYes, Alignment.MIDDLE_CENTER);
        buttonsLayout.addComponent(btnNo);
        buttonsLayout.setComponentAlignment(btnNo, Alignment.MIDDLE_CENTER);

        layout.addComponent(new Label(question));
        layout.addComponent(buttonsLayout);
        setContent(layout);

        layout.setMargin(true);
        buttonsLayout.setMargin(true);
        buttonsLayout.setSpacing(true);
        buttonsLayout.setWidth("100%");
        setWidth("300px");
        setHeight("160px");
        setResizable(false);

        btnYes.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                for (DecisionListener listener : decisionListeners) {
                    listener.yes(event);
                    close();
                }
            }
        });
        btnNo.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                for (DecisionListener listener : decisionListeners) {
                    listener.no(event);
                }
                close();
            }
        });
        btnCancel.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                for (DecisionListener listener : decisionListeners) {
                    listener.cancel(event);
                }
                close();
            }
        });
        addCloseListener(new Window.CloseListener() {
            @Override
            public void windowClose(Window.CloseEvent event) {
                for (DecisionListener listener : decisionListeners) {
                    listener.close(event);
                }
            }
        });
        addShortcutListener(new ShortcutListener("Close", ShortcutAction.KeyCode.ESCAPE, null) {
            @Override
            public void handleAction(Object sender, Object target) {
                close();
            }
        });
    }

    public static ConfirmWindow showYesNo(String caption, String question, String yes, String no) {
        ConfirmWindow window = new ConfirmWindow(caption, question, yes, no);
        UI.getCurrent().addWindow(window);
        return window;
    }

    void addDecisionListener(DecisionListener listener) {
        decisionListeners.add(listener);
    }
}
