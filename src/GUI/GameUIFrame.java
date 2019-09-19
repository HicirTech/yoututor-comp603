package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameUIFrame extends JFrame{
	private Block[][] modelBlocks;
	private GameUIPanel game;
	GameUIFrame(){
		super("name");
		this.setSize(1024,768);
		this.setVisible(true);
	}
	public Block[][] getModelBlocks() {
		return modelBlocks;
	}
	public void setModelBlocks(Block[][] modelBlocks) {
		this.modelBlocks = modelBlocks;
		this.game= new GameUIPanel(modelBlocks);
		this.setContentPane(game);
	}
	
	public void forceUpdate() {
		this.game=new GameUIPanel(this.modelBlocks);
		this.setContentPane(game);
	}

	public GameUIPanel getGame() {
		return game;
	}
	public void setGame(GameUIPanel game) {
		this.game = game;
	}
	
	
	

}
