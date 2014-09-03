package gameCollectorBuddy;

import java.math.BigDecimal;
import javafx.scene.image.Image;

public class Game 
{
	String title = null;
	String gameSystem = null;
	String URL = null;
	String condition = null;
	String UPC = null;
	String releaseDate = null;
	String ESRB = null;
	Image cover = null;
	String notes = null;
	BigDecimal paid = null;
	BigDecimal value = null;
	int raiting = 0;
	int copies = 0;
	Boolean completed = null;
	
	//CONSTRUCTOR
	Game(String gtitle, String ggameSystem, String gURL, String gcondition, String gUPC, String greleaseDate, String gESRB, Image gcover, String gnotes, BigDecimal gpaid, BigDecimal gvalue, int graiting, int gcopies, Boolean gcompleted)
	{
		title = gtitle;
		gameSystem = ggameSystem;
		URL = gURL;
		condition = gcondition;
		UPC = gUPC;
		releaseDate = greleaseDate;
		ESRB = gESRB;
		cover = gcover;
		notes = gnotes;
		paid = gpaid;
		value = gvalue;
		raiting = graiting;
		copies = gcopies;
		completed = gcompleted;
	}
	
	///////////////////
	//      GETS     //
	///////////////////
	String getTitle()
	{
		return title;
	}
	
	String getGameSystem()
	{
		return gameSystem;
	}
	
	String getURL()
	{
		return URL;
	}
	
	String getCondition()
	{
		return condition;
	}
	
	String getUPC()
	{
		return UPC;
	}
	
	String getReleaseDate()
	{
		return releaseDate;
	}
	
	String getESRB()
	{
		return ESRB;
	}
	
	Image getCover()
	{
		return cover;
	}
	
	String getNotes()
	{
		return notes;
	}
	
	BigDecimal getPaid()
	{
		return paid;
	}
	
	BigDecimal getValue()
	{
		return value;
	}
	
	int getRaiting()
	{
		return raiting;
	}
	
	int getCopies()
	{
		return copies;
	}
	
	Boolean getCompleted()
	{
		return completed;
	}
}
