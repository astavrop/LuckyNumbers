//TzokerColumn.java
/* This class generates and returns a random tzoker column*/
/* A tzoker colunm is consisting of 5 numbers 
which are different and have value from 1 to 45*/
//The last number is called "Tzoker number" and has value from 1 to 20
import java.util.Random;
import java.util.ArrayList;

public class TzokerColumn
{
	private int x;
	private int y;
	private int z;
	private int k;
	private int g;
	private int t;
	

	public void setX(int value)
	{
		x=value;
	}
	
	public int getX()
	{
		return x;
	}
	
	public void  setY(int value)
	{
		y=value;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void  setZ(int value)
	{
		z=value;
	}
	
	public int getZ()
	{
		return z;
	}
	
	public void  setK(int value)
	{
		k=value;
	}
	
	public int getK()
	{
		return k;
	}
	
	public void  setG(int value)
	{
		g=value;
	}
	
	public int getG()
	{
		return g;
	}
	
	public void  setT(int value)
	{
		t=value;
	}
	
	public int getT()
	{
		return t;
	}
	//Creates a new tzoker column
	public void createTzokerColumn()
	{
		ArrayList<Integer> elements = new ArrayList<>();
		int i=generateNumber(45);
		setX(i);
		elements.add(i);
		do
		{
			i=generateNumber(45);
		}
		while(!isAGoodNumber(i,elements));
		elements.add(i);
	        setY(i);
	        do
		{
			i=generateNumber(45);
		}
		while(!isAGoodNumber(i,elements));
		elements.add(i);
	        setZ(i);
	        do
		{
			i=generateNumber(45);
		}
		while(!isAGoodNumber(i,elements));
		elements.add(i);
	        setK(i);
	        do
		{
			i=generateNumber(45);
		}
		while(!isAGoodNumber(i,elements));
		elements.add(i);
	        setG(i);
	        i=generateNumber(20);
	        setT(i);
	        
	}
	//number is a good number only if it is a new one
	private boolean isAGoodNumber(int number,ArrayList<Integer> list)
	{
		if(list.contains(number))
		return false;
	        else 
	        return true;
		
	}
	//this method generates an integer from 1 to max
	private int generateNumber(int max)
	{
          Random generator = new Random(); 
          return  generator.nextInt(max) + 1;

	}
	
	public String getTzokerColumn()
	{
		return getX()+" "+ getY() +" "+
		getZ()+" "+ getK()+" "+ getG() +" "+ getT();
	}
	
}
