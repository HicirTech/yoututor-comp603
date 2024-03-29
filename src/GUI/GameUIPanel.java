package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GameUIPanel extends JPanel {

	private JButton[][] labels;
	private Block[][] modelBlocks;

	GameUIPanel(Block[][] modelBlocks) {
		this.setSize(1024, 768);
		this.setLayout(null);
		this.modelBlocks = modelBlocks;
		this.labels = new JButton[this.modelBlocks.length][this.modelBlocks[0].length];
		this.setLabels();
	}

	public void setLabels() {

		int yLocation = 0;
		for (int y = 0; y != this.labels.length; y++) {
			int xLocation = 0;
			for (int x = 0; x != this.labels[0].length; x++) {
				this.labels[y][x] = new JButton(this.modelBlocks[y][x].toString());
				this.labels[y][x].setBounds(xLocation, yLocation, 50, 50);
				this.add(this.labels[y][x]);
				
				xLocation += 50;
			}
			yLocation += 50;
		}
	}

	public JButton[][] getButtons() {
		return labels;
	}

	public void setLabels(JButton[][] labels) {
		this.labels = labels;
	}

	public Block[][] getModelBlocks() {
		return modelBlocks;
	}

	public void setModelBlocks(Block[][] modelBlocks) {
		this.modelBlocks = modelBlocks;
	}
	
}
