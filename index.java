import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class f1
{
	f1()
	{

	//1st Frame:

		JFrame f = new JFrame("f");
		
		ImageIcon icon = new ImageIcon("xyz.png");
 	    JButton b = new JButton("NEXT");
 	    b.setBounds(1100,600,100,30);

       
       f.add(new JLabel(icon));
       f.pack();
 	   f.add(b);
 	   f.setLayout(null);
 	   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setExtendedState(JFrame.MAXIMIZED_BOTH);
       //f.setSize(800,600);
       f.setVisible(true);

       

    //2nd Frama:

        JFrame f1 = new JFrame("f1");

        JLabel l = new JLabel("User Name:");
		l.setBounds(100,100,200,30);
        JTextField t = new JTextField();
		t.setBounds(250,100,100,30);
		
		JLabel l1 = new JLabel("Password:");
		l1.setBounds(100,150,200,30);
        JTextField t1 = new JTextField();
		t1.setBounds(250,150,100,30);

		JButton b1 =new JButton("login");
		b1.setBounds(200,250,80,30);
		JButton b2 = new JButton("Cancel");
		b2.setBounds(200,300,80,30);


		f1.add(l);
		f1.add(t);
		f1.add(l1);
		f1.add(t1);
		f1.add(b1);
		f1.add(b2);
		f1.setExtendedState(JFrame.MAXIMIZED_BOTH);

		

    //3rd Frame:

		 JFrame f2 = new JFrame("f2");
		 JMenuBar mb = new JMenuBar();

		 ImageIcon icon1 = new ImageIcon("xyz.png");


		JMenu m = new JMenu("Hotel Management");
		   JMenu a = new JMenu("Reception");
		   JMenuItem z = new JMenuItem("New Constomer Form");
		   JMenuItem c99 = new JMenuItem("Room");
		   JMenuItem d = new JMenuItem("Department");
		   JMenuItem e = new JMenuItem("All Employee Information");
		   JMenuItem y = new JMenuItem("Customer Information");
		   JMenuItem g = new JMenuItem("Manager Information");
		   JMenuItem h = new JMenuItem("Check Out");
		   JMenuItem i = new JMenuItem("Updates Status");
		   JMenuItem j = new JMenuItem("Updates Room Status");
		   JMenuItem k = new JMenuItem("Pick Up Services");
		   JMenuItem x = new JMenuItem("Search Room");
		   JMenuItem n = new JMenuItem("Logout");

		JMenu o = new JMenu("Admin");
			JMenuItem p = new JMenuItem("Add Employee");
			JMenuItem q = new JMenuItem("Add Rooms");
			JMenuItem r = new JMenuItem("Add Drivers");
		   
           m.add(a);
           a.add(z);
           a.add(c99);		   
           a.add(d);
           a.add(e);
           a.add(y);		   
           a.add(g);
           a.add(h);
           a.add(i);
           a.add(j);
           a.add(k);
           a.add(x);
           a.add(n);


           o.add(p);
           o.add(q);
           o.add(r);

           mb.add(m);
           mb.add(o);

        
        f2.add(new JLabel (icon1));
        f2.pack();
        f2.setJMenuBar(mb);
       
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //4th freame

        JFrame f3 = new JFrame("f3");

        JLabel l2 = new JLabel("Name:");
		l2.setBounds(100,100,200,30);
        JTextField t2 = new JTextField();
		t2.setBounds(250,100,100,30);
		
		JLabel l3 = new JLabel("Age:");
		l3.setBounds(100,150,200,30);
        JTextField t3 = new JTextField();
		t3.setBounds(250,150,100,30);

        JLabel l4 = new JLabel("Gender:");
		l4.setBounds(100,200,200,30);
        JTextField t4 = new JTextField();
		t4.setBounds(250,200,100,30);
		
		//checkbox
		JLabel l5 = new JLabel("Job:");
		l5.setBounds(100,250,200,30);
        JTextField t5 = new JTextField();
		t5.setBounds(250,250,100,30);

		JLabel l6 = new JLabel("Salary:");
		l6.setBounds(100,300,200,30);
        JTextField t6 = new JTextField();
		t6.setBounds(250,300,100,30);
		
		JLabel l7 = new JLabel("Phona Number:");
		l7.setBounds(100,350,200,30);
        JTextField t7 = new JTextField();
		t7.setBounds(250,350,100,30);

        JLabel l8 = new JLabel("Addhar Number");
		l8.setBounds(100,400,200,30);
        JTextField t8 = new JTextField();
		t8.setBounds(250,400,100,30);
		
		JLabel l9 = new JLabel("Email id");
		l9.setBounds(100,450,200,30);
        JTextField t9 = new JTextField();
		t9.setBounds(250,450,100,30);


		JButton b3 =new JButton("Submit");
		b3.setBounds(200,500,80,30);
		JButton b4 = new JButton("Back");
		b4.setBounds(300,500,80,30);


        f3.add(b4);
        f3.add(b3);
		f3.add(l2);
		f3.add(t2);
		f3.add(l3);
		f3.add(t3);
		f3.add(l4);
		f3.add(t4);
		f3.add(l5);
		f3.add(t5);
		f3.add(l6);
		f3.add(t6);
		f3.add(l7);
		f3.add(t7);
		f3.add(l8);
		f3.add(t8);
		f3.add(l9);
		f3.add(t9);


		//5th Frame

		JFrame f4 = new JFrame("F4");

		JLabel l10 = new JLabel("Name:");
		l10.setBounds(100,100,200,30);
        JTextField t10 = new JTextField();
		t10.setBounds(250,100,100,30);
		
		JLabel l11 = new JLabel("Government id");
		l11.setBounds(100,150,100,30);
        Choice c = new Choice();
		c.setBounds(250,150,100,30);
		c.add("Aadhaar Number");
		c.add("Pan Card");
		c.add("Passport");
		c.add("Driving License");
		c.add("voter id");

        JLabel l12 = new JLabel("ID Number");
		l12.setBounds(100,200,200,30);
        JTextField t12 = new JTextField();
		t12.setBounds(250,200,100,30);
		
		
		JLabel l13 = new JLabel("Gender");
		l13.setBounds(100,250,200,30);
		JRadioButton b5 = new JRadioButton("Male");
	    b5.setBounds(250,250,75,40);
	    JRadioButton b6 = new JRadioButton("feMale");
	    b6.setBounds(350,250,80,40);

        //JTextField t5 = new JTextField();
		//t5.setBounds(250,250,100,30);

		JLabel l14 = new JLabel("Country");
		l14.setBounds(100,300,200,30);
        Choice c1 = new Choice();
		c1.setBounds(250,300,200,50);
		c1.add("India");
		c1.add("Abu Dhabi");
		c1.add("japan");
		c1.add("Dubai");

        //JTextField t6 = new JTextField();
		//t6.setBounds(250,300,100,30);
		
		JLabel l15 = new JLabel("Allocated room number");
		l15.setBounds(100,350,200,30);
        JTextField t14 = new JTextField();
		t14.setBounds(250,350,100,30);

        JLabel l16 = new JLabel("Check in The time");
		l16.setBounds(100,400,200,30);
        JTextField t15 = new JTextField();
		t15.setBounds(250,400,100,30);
		
		JLabel l17 = new JLabel("Deposit");
		l17.setBounds(100,450,200,30);
        JTextField t16 = new JTextField();
		t16.setBounds(250,450,100,30);

		JLabel l18 = new JLabel();
		l18.setBounds(100,500,200,30);


		JButton b7 =new JButton("Add Customer");
		b7.setBounds(200,550,200,30);
		JButton b8 = new JButton("Back");
		b8.setBounds(200,600,80,30);





		f4.add(l10);
		f4.add(t10);
		f4.add(l11);
		f4.add(c);
		f4.add(l12);
		f4.add(t12);
		f4.add(l13);
		f4.add(b5);
		f4.add(b6);
	    f4.add(l13);
		f4.add(c1);
		f4.add(l14);
		f4.add(t14);
		f4.add(l15);
		f4.add(t15);
		f4.add(l16);
		f4.add(t16);
		f4.add(l17);
		f4.add(l18);
		f4.add(b7);
		f4.add(b8);
		f4.setLayout(null);
	

	   //6th frame

		JFrame f5 = new JFrame("f5");

		//ImageIcon icon2 = new ImageIcon("x.png");
		//icon2.setBounds(300,100,100,100);

		JLabel l19 = new JLabel("Room Number");
		l19.setBounds(100,100,200,30);
        JTextField t19 = new JTextField();
		t19.setBounds(250,100,100,30);
		
		JLabel l20 = new JLabel("Available");
		l20.setBounds(100,150,200,30);
        JTextField t20 = new JTextField();
		t20.setBounds(250,150,100,30);

        JLabel l21 = new JLabel("Cleainig Status");
		l21.setBounds(100,200,200,30);
        JTextField t21 = new JTextField();
		t21.setBounds(250,200,100,30);
		
		
		JLabel l22 = new JLabel("Price");
		l22.setBounds(100,250,200,30);
        JTextField t22 = new JTextField();
		t22.setBounds(250,250,100,30);

		JLabel l23 = new JLabel("Bed Type");
		l23.setBounds(100,300,200,30);
        JTextField t23 = new JTextField();
		t23.setBounds(250,300,100,30);

		JButton b9 =new JButton("Add");
		b9.setBounds(200,350,80,30);
		JButton b10 = new JButton("Back");
		b10.setBounds(200,400,80,30);


        //f5.add(new JLabel (icon2));
        //f5.pack();
		f5.add(l19);
		f5.add(t19);
		f5.add(l20);
		f5.add(t20);
		f5.add(l21);
		f5.add(t21);
		f5.add(l22);
		f5.add(t22);
		f5.add(l23);
		f5.add(t23);
		f5.add(b9);
		f5.add(b10);
		f5.setLayout(null);


		//7th frame

		JFrame f6 = new JFrame("f6");

		JLabel l24 = new JLabel("Name");
		l24.setBounds(100,100,200,30);
        JTextField t24 = new JTextField();
		t24.setBounds(250,100,100,30);
		
		JLabel l25 = new JLabel("Age");
		l25.setBounds(100,150,200,30);
        JTextField t25 = new JTextField();
		t25.setBounds(250,150,100,30);

        JLabel l26 = new JLabel("Gender");
		l26.setBounds(100,200,200,30);
        JTextField t26 = new JTextField();
		t26.setBounds(250,200,100,30);
		
		
		JLabel l27 = new JLabel("Car Name");
		l27.setBounds(100,250,200,30);
        JTextField t27 = new JTextField();
		t27.setBounds(250,250,100,30);

		JLabel l28 = new JLabel("Available");
		l28.setBounds(100,300,200,30);
        JTextField t28 = new JTextField();
		t28.setBounds(250,300,100,30);

		JLabel l29 = new JLabel("Location");
		l29.setBounds(100,350,200,30);
        JTextField t29 = new JTextField();
		t29.setBounds(250,350,100,30);


		JButton b11 =new JButton("Add");
		b11.setBounds(200,400,80,30);
		JButton b12 = new JButton("Back");
		b12.setBounds(200,450,80,30);


		f6.add(l24);
		f6.add(t24);
		f6.add(l25);
		f6.add(t25);
		f6.add(l26);
		f6.add(t26);
		f6.add(l27);
		f6.add(t27);
		f6.add(l28);
		f6.add(t28);
		f6.add(l29);
		f6.add(t29);
		f6.add(b11);
		f6.add(b12);
		f6.setLayout(null);


		b8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				    f2.setVisible(true);
					
					f4.setVisible(false);
					f4.setSize(800,700);

			}
		});





		b12.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				    f2.setVisible(true);
					
					f6.setVisible(false);
					f4.setSize(800,700);

			}
		});
		

		 r.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				    f2.setVisible(false);
					f5.setLayout(null);
					f6.setVisible(true);
					f6.setSize(800,600);

			}
		});
        


      q.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				    f2.setVisible(false);
					f5.setLayout(null);
					f5.setVisible(true);
					f5.setSize(800,600);

			}
		});
        

        b10.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				    f2.setVisible(true);
					f5.setLayout(null);
					f5.setVisible(false);
					f5.setSize(800,600);

			}
		});


		




       b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				    f.setVisible(true);
					f1.setLayout(null);
					f1.setVisible(true);
					f1.setSize(800,600);

			}
		});


        b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				    f2.setVisible(true);
					f2.setLayout(null);
					f1.setVisible(false);
					f2.setSize(800,600);
					f2.setExtendedState(JFrame.MAXIMIZED_BOTH);

			}
		});

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				    f.setVisible(true);
					f.setLayout(null);
					f.setVisible(true);
					f.setSize(800,600);

			}
		});

		p.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				    f2.setVisible(true);
					f3.setLayout(null);
					f3.setVisible(true);
					f3.setSize(800,600);

			}
		});


		
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				    f2.setVisible(true);
					f3.setLayout(null);
					f3.setVisible(false);
					f3.setSize(800,600);

			}
		});


		z.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				    f4.setVisible(true);
					f2.setLayout(null);
					f2.setVisible(false);
					f4.setSize(800,700);

			}
		});
        

        n.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				    f1.setVisible(true);
					f1.setLayout(null);
					f2.setVisible(false);
					f1.setSize(800,700);

			}
		});
        

       
         
        
           



		




		

		
		



	}


	public static void main(String args[])
    {

     	f1 obj = new f1();
 	   
 	} 
}