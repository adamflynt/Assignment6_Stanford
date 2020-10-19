import acm.graphics.*;
import acm.program.*;

public class FlipImage extends GraphicsProgram {
	private static GImage image;

	public void run() {


		image = new GImage("milkmaid.jpg");

		add(flipImage(image)); 
	}

	private GImage flipImage(GImage image) {
		int[][] pixelArray = image.getPixelArray();
		int width = pixelArray[0].length;
		int height = pixelArray.length;

		for (int i = 0; i < height; i++) {
			for (int j = width-1; j >= width/2; j--) {
				int temp = pixelArray[i][(width - j) - 1];
				pixelArray[i][(width-j)-1] = pixelArray[i][j];
				pixelArray[i][j] = temp;
			} 
		}
		return new GImage(pixelArray); 
	}
}