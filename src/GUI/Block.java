package GUI;

public class Block {

	private BlockType type;
	private int x, y;

	Block(BlockType type, int x, int y) {
		this.x = x;
		this.y = y;
		this.type = type;
	}

	public BlockType getType() {
		return type;
	}

	public void setType(BlockType type) {
		this.type = type;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return this.getType().toString();
	}
}