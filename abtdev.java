import javax.swing.plaf.metal.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
class abtdev extends JFrame 
{
ImageIcon img;
JLabel l1,l2;
abtdev()
{
setLayout(null);
try
{
UIManager.LookAndFeelInfo looks[];
looks = UIManager.getInstalledLookAndFeels();
UIManager.setLookAndFeel(looks[1].getClassName() );
SwingUtilities.updateComponentTreeUI( this );
}
catch(Exception e)
{
System.out.println("Caughted exception is "+e);
}
img=new ImageIcon(getClass().getResource("abtpic.png"));
l1=new JLabel(img);
l2=new JLabel("<HTML>Samridhi is a diligent Bachelor of Technology (B.Tech) student specializing in Computer Science and Engineering (CSE) at JMIT Radaur, a prestigious institution. She is currently in her third year of studies. She began her educational journey at St. Thomas School in Jagadhri, where she consistently achieved an outstanding 93% in both her 10th and 12th-grade examinations.
<BR>Residing in Yamunanagar, Samridhi's unwavering commitment to her field is evident through her recent completion of Industrial Training in Full Stack Web Development. Her profound passion for technology and web development drives her to excel in her academic pursuits and beyond, as she aspires to make significant contributions to the world of software engineering.</HTML>");
l1.setBounds(30,30,img.getIconWidth(),img.getIconHeight());
l2.setBounds(img.getIconWidth()+60,30,320,300);
add(l1);add(l2);
}
public static void main(String args[])
{
abtdev dev=new abtdev();
Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
dev.setSize((int)dimension.getWidth()/2+40,(int)dimension.getHeight()/2+70);
dev.setVisible(true);
dev.setTitle("About Project Developer");
dev.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
}

