package GUI;

public class GameController {
	
	private Block[][] blocks;
	GameController(int maxX,int maxY){
		
		this.blocks = new Block[maxX][maxY];

		for(int y=0; y!=maxY;y++) {
			for(int x=0;x!=maxX;x++) {
				this.blocks[x][y]= new Block(BlockType.E,x,y);
			}
		}
	}
	
	public void mark(int x, int y, BlockType t) {
		if(this.blocks[y][x].getType()==BlockType.E&&t!=BlockType.E) {
			this.blocks[y][x].setType(t);
		}else {
			System.out.println("Cannot mark this block");
		}
	}
	
	
	public Block[][] getBlocks() {
		return blocks;
	}

	public void setBlocks(Block[][] blocks) {
		this.blocks = blocks;
	}

	public String toString() {
		String toStringing ="";
		for(Block[] bs : this.blocks) {
			for(Block b: bs) {
				toStringing += b.toString();
			}
			toStringing+=System.lineSeparator();
		}
		return toStringing;
	}

}
