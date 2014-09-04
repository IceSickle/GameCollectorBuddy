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
	
	public List<String> findGame(String gameName)
	{
		List<String> triples = new ArrayList<String>();
		String searchURL = "http://videogames.pricecharting.com/search?q=" + gameName.trim();		
		String line = "";
		try
		{
			URL url = new URL(searchURL);
			BufferedReader buff = new BufferedReader(new InputStreamReader(url.openStream()));
			boolean EOF = false;
			System.out.println(url.toString());
			for(int i = 0; i<10; i++)
			{
				line = buff.readLine();
			}
			
			if(line.contains("| Search Results"))
			{
				while(!EOF)
				{
					line = buff.readLine().trim();
					if(line.contains("end content"))
					{
						EOF = true;
					}
					if(line.contains("<td class=\"title\">"))
					{
						line = buff.readLine().trim();
						System.out.println(line);
						line = buff.readLine().trim();
						line = buff.readLine().trim();
						System.out.println(line);
						System.out.println();
					}
				}
			}
			else
			{
				System.out.println("game found");
			}
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return triples;
	}
}
