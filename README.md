confirm-window
==============

Confirmation window for Vaadin 7

Basic usage
===========

```java
Button button = new Button("Click Me");
button.addClickListener(new Button.ClickListener() {
    public void buttonClick(ClickEvent event) {
        String caption = "Remove user";
        String question = "What do you want remove selected user?";
        String yes = "Yes, remove him";
        String no = "No, cancel this action";
        ConfirmWindow confirmWindow = ConfirmWindow.showYesNo(caption, question, yes, no);
        confirmWindow.addDecisionListener(new AbstractDecisionListener() {
            @Override
            public void yes(ConfirmEvent event) {
                System.out.println("Do what you should do when user want to remove user");
            }
        });
    }
});
```

