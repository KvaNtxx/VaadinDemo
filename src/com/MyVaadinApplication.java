package com;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

/**
 * Created by KvaNt on 28.11.2015.
 */
public class MyVaadinApplication extends UI {
    @Override
    public void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        setContent(layout);
        layout.addComponent(new Label("Hello, world!"));
    }
}
