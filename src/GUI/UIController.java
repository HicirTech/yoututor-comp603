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
						handleUpdate(sb);
					}

				});
			}
		}
	}

	public void handleUpdate(JButton sb) {
		int[] location = stringToXY(sb.toString());
		System.out.println(Arrays.toString(location));
		g.mark(location[0], location[1], isO ? BlockType.o : BlockType.x);
		isO = !isO;
		System.out.print(g);
		uif.forceUpdate();
	}


}
