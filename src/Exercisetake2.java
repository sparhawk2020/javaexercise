import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Exercisetake2 {
    private JTextField txtcust;
    private JTextField txtdays;
    private JRadioButton rb1;
    private JRadioButton rb3;
    private JRadioButton rb2;
    private JCheckBox cksen;
    private JCheckBox ckmember;
    private JButton computeButton;
    private JPanel bicycle;
    private JLabel lblcustomer;
    private JLabel lbldays;
    private JLabel lblpic;
    private JLabel lbltotal;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;

    private  static JFrame frame = new JFrame("Bicycle Exercise");

    public Exercisetake2() {
        computeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //check if there is data in the number of days

                String rr = txtdays.getText();



                if(txtdays.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"You must enter the number of days");

                    return;

                }

                if((rb1.isSelected()==false) && (rb2.isSelected()==false) && (rb3.isSelected()==false)) {

                    JOptionPane.showMessageDialog(null,"You must select a bike model");

                    return;
                }


                int days;
              double total=0.0;

                days = Integer.parseInt(txtdays.getText());

                if(days > 5 && days <= 10) {
                    if(rb1.isSelected()) {

                        total = (days * 14) - ((days * 14) * .08);


                    }

                    if(rb2.isSelected()){

                        total = (days * 12) - ((days * 12) * .08);

                    }


                    if(rb3.isSelected()){

                        total = (days * 10) - ((days * 10) * .08);

                    }

                } else {


                    total = (days * 12);

                }


                if(days > 10){
                    if(rb1.isSelected()) {

                        total = (days * 14) - ((days * 14) * .15);


                    }

                    if(rb2.isSelected()){

                        total = (days * 12) - ((days * 12) * .15);

                    }


                    if(rb3.isSelected()){

                        total = (days * 10) - ((days * 10) * .15);

                    }

                }


                if(ckmember.isSelected()){

                    total = total - (total * .05);
                }

                if(cksen.isSelected()){

                    total = total - (total * .10);
                }


                Double xxx = total;

                String ff;
                ff = String.format("%.2f",total);



             //   String strDouble = String.format("%.2f", total);

                //lbltotal.setText(ff);


                DecimalFormat dec = new DecimalFormat("#0.00");

               String fff2 = dec.format(total);

                lbltotal.setText((dec.format(total)).toString());




            }
        });
        rb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                ImageIcon imageIcon = new ImageIcon(new ImageIcon("bike4.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                //label.setIcon(imageIcon);

                //lblpic.setIcon(new ImageIcon("bike1.jpg"));

                lblpic.setIcon(imageIcon);

            }
        });
    }

    public static void main(String[] args) {
        //JFrame frame = new JFrame("Exercisetake2");
        frame.setContentPane(new Exercisetake2().bicycle);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400,400);

        //frame.setPreferredSize(new Dimension(500, 500));

        //frame.pack();
        frame.setVisible(true);

        Exercisetake2 obj1 = new Exercisetake2();




         obj1.setup();




    }





    public void setup(){



    }
}
