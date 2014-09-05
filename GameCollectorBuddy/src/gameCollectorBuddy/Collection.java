package gameCollectorBuddy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Collection implements Serializable
{
	Collection()
	{
		
	}
	
	//Searches pricecharting.com for the passed in game name
	public List<String> findGame(String gameName)
	{
		List<String> games = new ArrayList<String>();
		String searchURL = "http://videogames.pricecharting.com/search?q=" + gameName.trim();		
		String line = "";
		
		//Trys to connect to pricecharting and search.
		try
		{
			URL url = new URL(searchURL);
			BufferedReader buff = new BufferedReader(new InputStreamReader(url.openStream()));
			boolean EOF = false;
			
			//Reads the first 10 lines the 10th line 
			//will indicate if the game was found or multiple games were found
			for(int i = 0; i<10; i++)
			{
				line = buff.readLine();
			}
			
			//If 10th line contains Search Results then multiple games were found
			if(line.contains("| Search Results"))
			{
				while(!EOF)
				{
					line = buff.readLine().trim();
					//end content indicates the end of the file.
					if(line.contains("end content"))
					{
						EOF = true;
					}
					//This line is the start of each game
					if(line.contains("<td class=\"title\">"))
					{
						String[] line2 = buff.readLine().trim().split(">");
						line = line2[1].substring(0,line2[1].length()-3);
						String gameURL = "http://videogames.pricecharting.com".concat(line2[0].substring(9,line2[0].length()-1));
						System.out.println(gameURL);
						games.add(line);
						System.out.println(line);
						buff.readLine().trim();
						line2 = buff.readLine().trim().split(">");
						line = line2[1].substring(0,line2[1].length()-4);
						games.add(line);
						games.add(gameURL);
						System.out.println(line);
						System.out.println();
					}
				}
			}
			//if Search Results was not on the 10th line then the game was found and the url can be returned.
			else
			{
				line = line.trim();
				line = line.substring(7,line.length()-8);
				//Found a game
				if(line.length() > 0)
				{
					System.out.println("Game Found!");
					System.out.println(url.toString());
					games.add(searchURL);
				}
				//Else no results were found
				else
				{
					//no results do nothing list will be passed back empty
				}
			}
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//returns the list of games if length of this list is 1 then the game 
		//was an exact hit. If greater then 1 then multiple games were found.
		//if list length is 0 then no results were found.
		return games;
	}
}
