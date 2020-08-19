
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Mali extends JFrame {
	private JPanel contentPane;
	public MalinFlagCanvas MalinFlagCanvas = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mali frame = new Mali();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mali() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		MalinFlagCanvas = new MalinFlagCanvas();
		contentPane.add(MalinFlagCanvas);
		this.repaint();
	}

}
class MalinFlagCanvas extends Canvas {
	public static final long serialVersionUID = 1L;
	
	
	/**
	 * A method to paint the flag and draw String.
	 * 
	 * @param g
	 * 			Graphics
	 */
	public void paint(Graphics g) {

		super.paint(g);

		int R = 20;
		int G = 151;
		int B = 58;
		Color rectColor1 = new Color(R, G, B);
		g.setColor(rectColor1);
		g.fillRect(10,10, 200, 350);
		int R1 = 252;
		int G1 = 209;
		int B1 = 22;
		Color rectColor2 = new Color(R1, G1, B1);
		g.setColor(rectColor2);

		g.fillRect(210, 10, 200, 350);
		
		int R2 = 206;
		int G2 = 17;
		int B2 = 38;
		Color rectColor3 = new Color(R2, G2, B2);
		g.setColor(rectColor3);
		g.fillRect(410,10, 200, 350);

		Font myFont = new Font("Monospaced", Font.PLAIN, 20);
		g.setFont(myFont);
		g.setColor(Color.BLUE);
		g.drawString("National Flag of Mali", 30, 400);

	}
}

