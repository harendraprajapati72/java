import java.awt.*;
import java.awt.event.*;




class Design extends Frame implements ActionListener{


	 Label l1,l2,l3; 
  Button b;
 TextField t1,t2;

Design()
{


	// Frame f = new Frame("Button Example");
setBackground(Color.red);

   b = new Button("Login");
        b.setBounds(100,190,100,20);

    l1=new Label("First Label.");  
    l1.setBounds(50,100, 100,30);  
    l2=new Label("Second Label.");  
    l2.setBounds(50,150, 100,30); 

     l3=new Label("Second Label.");  
    l3.setBounds(500,250, 200,30);

      
    t1=new TextField();  
    t1.setBounds(170,100, 200,30);  
    t2=new TextField();  
    t2.setBounds(170,150, 200,30);  

    b.addActionListener(this); 
    b.setBackground(Color.blue);


 

 

   add(b);
  add(l1);
   add(l2);
   add(t1);
 add(t2);
  add(l3);
   setSize(1000,1000);
  setLayout(null);
   setVisible(true);

}
  public void actionPerformed(ActionEvent e)
   {
      // String f_name = t1.getText().toString();
      // String l_name = t2.getText().toString();

      // String name = f_name + " " + l_name;
      // l3.setText(name);



   	Design1 d1 = new Design1("worker");
   	d1.setVisible(true);
   	this.setVisible(false);
   }
 

}






// ===============================

class Design1 extends Frame implements ActionListener{


	 Label l1,l2,l3; 
  Button b;
 TextField t1,t2;

Design1(String name)
{


	


   b = new Button("Login");
        b.setBounds(100,190,100,20);

    // l1=new Label("First Label.");  
    // l1.setBounds(50,100, 100,30);  
    // l2=new Label("Second Label.");  
    // l2.setBounds(50,150, 100,30); 

     l3=new Label("Second Label.");  
    l3.setBounds(500,250, 200,30);
    l3.setText(name);

      
    t1=new TextField();  
    t1.setBounds(170,100, 200,30);  
    t2=new TextField();  
    t2.setBounds(170,150, 200,30);  

    b.addActionListener(this); 

 

 

  add(b);
  //  add(l1);
  // add(l2);
  add(t1);
  add(t2);
  add(l3);
  setSize(1000,1000);
setLayout(null);
 setVisible(true);

}
  public void actionPerformed(ActionEvent e)
   {
      String f_name = t1.getText().toString();
      String l_name = t2.getText().toString();

      String name = f_name + " " + l_name;
      l3.setText(name);
   }
 

}





public class FrameExample
{


	public static void main(String args[])
	{
          Design d = new Design();

	}
	

}