import java.awt.*;

public class MouseController{

	private Robot robot;

	public MouseController(){
		try{	
			robot = new Robot();
		} catch(AWTException e){
			e.printStackTrace();
		}
	}

	public Point getPosition(){
		return cursor = MouseInfo.getPointerInfo().getLocation();
	}

	public void setPosition(int x, int y){
		robot.mouseMove(x, y);
	}

	public void centerCursor(){
		Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
       		int lar = (int) resolucao.getWidth();
        	int alt = (int) resolucao.getHeight();
		robot.mouseMove( (int)lar/2, (int)alt/2 );
	}
}
