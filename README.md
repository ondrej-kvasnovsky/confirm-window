confirm-window
==============

Confirmation window for Vaadin 7

Basic usage
===========

```java
Button button = new Button("Click Me");
button.addClickListener(new Button.ClickListener() {
    public void buttonClick(ClickEvent event) {
        ConfirmWindow confirmWindow = ConfirmWindow.showYesNo("Remove user", "What do you want remove selected user?", "Yes, remove him", "No, cancel this action");
        confirmWindow.addDecisionListener(new AbstractDecisionListener() {
            @Override
            public void yes(ConfirmEvent event) {
                System.out.println("Do what you should do when user want to remove user");
            }
        });
    }
});
```

