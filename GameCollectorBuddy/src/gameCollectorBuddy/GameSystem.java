package gameCollectorBuddy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameSystem
{
	private String name;
	private List<Game> games = new ArrayList<Game>();
	private List<Hardware> hardware = new ArrayList<Hardware>();
	
	public GameSystem()
	{
		
	}
	
	public void saveData()
	{
		for(Game g : games)
		{
			g.writeGame();
		}
		for(Hardware h : hardware)
		{
			h.writeGame();
		}
	}
	
	public void updateValues()
	{
		//TODO go though each game and get updated value.
	}
	
	public void addGame(Game g)
	{
		games.add(g);
		Collections.sort(games);
	}
	
	public void addHardware(Hardware h)
	{
		hardware.add(h);
		Collections.sort(hardware);
	}
	
	public boolean contains(Game g)
	{
		for(Game x: games)
		{
			//System.out.println(x.getTitle() + " : " + g.getTitle());
			if(g.getTitle().equalsIgnoreCase(x.getTitle()))
			{
				return true;
			}
		}
		return false;
	}
	
	//FOR DEBUG ONLY
	public void printGames()
	{
		for(Game g: games)
		{
			System.out.println(g.getTitle() + " " + g.getWorth() + " " + g.getURL());
		}
	}
}
