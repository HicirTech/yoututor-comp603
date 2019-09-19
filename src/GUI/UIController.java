package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;

public class UIController {
	private GameUIFrame uif;
	private GameController g;

	int currentX = 0;
	int currentY = 0;
	JButton[][] bs;
	boolean isO;

	UIController() {
		this.isO = false;
		this.g = new GameController(3, 3);
		this.uif = new GameUIFrame();
		this.uif.setModelBlocks(g.getBlocks());
		this.bs = uif.getGame().getButtons();
		addAction();
	}

	public void addAction() {
		for (JButton[] b : bs) {
			for (JButton sb : b) {
				sb.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int[] checker = stringToXY(sb.toString());						
						g.getBlocks()[checker[0]][checker[1]].setType(isO?BlockType.o:BlockType.x);
						sb.setText(g.getBlocks()[checker[0]][checker[1]].toString());
						isO=!isO;
					}

				});
			}
		}
	}
	private int[] stringToXY(String check) {
		int x = Integer.parseInt(check.split(",")[1]);
		int y = Integer.parseInt(check.split(",")[2]);
		return new int[] { x / 50, y / 50 };

	}

}
