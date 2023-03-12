package ToDoList;

import javax.swing.*;
import java.awt.*;
import java.awt.Component;

public class List extends JPanel {
    public List() {
        GridLayout Layout = new GridLayout(10,1);
        Layout.setVgap(5);
        this.setLayout(Layout);


    }

    public void indexnum() {
        Component[] listoomp = this.getComponents();
        for (int i = 0; i < listoomp.length; i++) {
            if (listoomp[i] instanceof Task) {
                ((Task) listoomp[i]).writeindexjl(i + 1);
            }

        }
    }
}

