package tap.src.main;

import java.awt.Graphics;


public class Coin extends GameObject implements Entity {
	private Textures text;
	
	public Coin(double x,double y,Textures text)
	{
		super(x, y);
		this.text=text;
		
	}
	
	public void tick()
	{
		y-=10;
	}
	
	public void render(Graphics graphic)
	{
		graphic.drawImage(text.coin,(int) x,(int) y, null);
		graphic.drawRect((int)x, (int)y, 32, 32);
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
}
