import java.awt.Color;
public class Editor4 {
	public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] Image = Runigram.read(source);
		
		Runigram.setCanvas(Image);
		
		
		Runigram.display(Image);
		Runigram.morph(Image,Runigram.grayScaled(Image), n);
		StdDraw.pause(5000); 
			
	}
		
		
	}