import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame {

	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(400,180);
		f.setLayout(null);
		
		Label lid = new Label("ID : ", Label.RIGHT);
		lid.setSize(50,50);
		lid.setLocation(50,40);
		Label lpwd = new Label("Password : ", Label.RIGHT);
		lpwd.setSize(70,50);
		lpwd.setLocation(50,70);
		
		TextField id = new TextField(20);
		id.setSize(200,30);
		id.setLocation(130,50);
		TextField pwd = new TextField(20);
		pwd.setSize(200,30);
		pwd.setLocation(130,80);
		TextField tfMsg = new TextField(35);
		tfMsg.setSize(280,30);
		tfMsg.setLocation(50,120);
		pwd.setEchoChar('*');
		
		Button b = new Button("Login");
		b.setSize(50,100);
		b.setLocation(330,50);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(id.getText()+" : "+pwd.getText());
			}
		});

//		Canvas c = new Canvas();
//		c.setBackground(Color.red);
//		c.setBounds(50,50,150,100);
		
//		Panel p = new Panel();
		

		
//		f.add(c);
		
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		
		f.add(b);
		f.add(tfMsg);
		f.setVisible(true);

		
	}

}
