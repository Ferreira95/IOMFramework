import java.awt.Point;
import java.awt.MouseInfo;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.AWTException;

public class MouseController
{
	private Robot robot;

	public MouseController()
	{
		try
		{	
			robot = new Robot();
		}
		catch(AWTException e)
		{
			e.printStackTrace();
		}
	}

	public Point getPosition()
	{
		Point cursor = MouseInfo.getPointerInfo().getLocation();
		return cursor;
	}

	public void setPosition(int lar, int alt)
	{
		Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
		robot.mouseMove(lar, alt);
	}

	public void centerCursor()
	{
		Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
       		int lar = (int) resolucao.getWidth();
        	int alt = (int) resolucao.getHeight();
		robot.mouseMove( (int)lar/2, (int)alt/2 );
	}
}
