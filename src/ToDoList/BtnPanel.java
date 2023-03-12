package ToDoList;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BtnPanel extends JPanel {
    private JButton addtask;
    private JButton clear;
    Border emptyborder=BorderFactory.createEmptyBorder();
    public BtnPanel(){
        this.setPreferredSize(new Dimension(400,60));
        this.setBackground(new Color(255,153,153));
        addtask=new JButton("add task");
        addtask.setBorder(emptyborder);
        addtask.setFont(new Font("sans-serif",Font.PLAIN,20));
        this.add(this. addtask);
        this.add(Box.createHorizontalStrut(20));

        clear=new JButton("clear All Task ");
        clear.setBorder(emptyborder);
        clear.setFont(new Font("sans-serif",Font.PLAIN,20));
        this.add(this.clear);

    }
    public JButton getAddtaskbutton(){
        return addtask;
    }

    public JButton getclearbutton(){
        return clear;
    }
}
