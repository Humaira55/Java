package Assignment_13;

public class Beans {
	
	private String color;
	private int length;
	private int width;
	private String shape;
	
	public Beans(String color, int length, int width, String shape) {
		this.setColor(color) ;
		this.setLength(length);
		this.setWidth(width) ;
		this.setShape(shape) ;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "Beans [color=" + color + ", length=" + length + ", width=" + width + ", shape=" + shape + "]";
	}

	@Override
	public int hashCode() {
		return this.length;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if(!(obj instanceof Beans)) return false;
		
		return this.length == ((Beans)obj).length;
	}
	
		public static void main(String[] args)
		{
			Beans b1 = new Beans("Green", 9,3,"Oval");
			Beans b2 = new Beans("Brown", 5,5,"Circle");
			Beans b3 = new Beans("Green", 9,3,"Oval");
			
			System.out.println(b1.equals(b3));
		}
}
