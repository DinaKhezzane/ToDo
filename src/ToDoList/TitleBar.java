package ToDoList;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {
    JLabel  TitleText = new JLabel("To Do List App");
    public TitleBar(){
        this.setPreferredSize(new Dimension(400,60));
        this.setBackground(new Color(255,153,153));
        TitleText.setPreferredSize(new Dimension(200,80));
        TitleText.setFont(new Font("sans-serif",Font.BOLD,20));
         TitleText.setAlignmentX(JLabel.TOP);
         this.add(this.TitleText);



    }
}
