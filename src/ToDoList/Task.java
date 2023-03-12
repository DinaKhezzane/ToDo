package ToDoList;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {
    private JLabel index;
    private JTextField taskname;
    private JButton done;
    private JButton remove;

    public Task() {
        GridLayout Layouttask = new GridLayout(1, 4);
        Layouttask.setHgap(5);
        this.setPreferredSize(new Dimension(400, 200));
        this.setBackground(new Color(204, 229, 255));
        this.setLayout(Layouttask);

        index = new JLabel("");
        index.setPreferredSize(new Dimension(10, 20));
        this.setAlignmentY(JLabel.LEFT);
        this.add(this.index);

        taskname = new JTextField("enter task");
        taskname.setPreferredSize(new Dimension(10, 20));
        taskname.setBorder(BorderFactory.createEmptyBorder());
        taskname.setBackground(new Color(204, 229, 255));
        this.add(this.taskname);


        done = new JButton("Done");
        done.setPreferredSize(new Dimension(10, 20));
        this.add(this.done);
        remove = new JButton("Remove");
        remove.setPreferredSize(new Dimension(10,20 ));
        this.add(this.remove);

    }
    public void writeindexjl(int n) {
        this.index.setText(String.valueOf(n));
        this.revalidate();
    }
  public JButton getremovej() {
      return this.remove;
  }
    public JButton getdonej() {
        return this.done;
    }
 public void donestatus() {

     this.remove.setBackground(new Color(153,255,153));
     this.done.setBackground(new Color(153,255,153));
     this.taskname.setBackground(new Color(153,255,153));
      this.index.setBackground(new Color(153,255,153));
     revalidate();
     repaint();
 }
    }


