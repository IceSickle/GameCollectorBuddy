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
	
	///////////////////
	//      SETS     //
	///////////////////
	void setTitle(String gtitle)
	{
		title = gtitle;
	}
	
	void setGameSystem(String ggameSystem)
	{
		gameSystem = ggameSystem;
	}
	
	void setURL(String gURL)
	{
		URL = gURL;
	}
	
	void setCondition(String gcondition)
	{
		condition = gcondition;
	}
	
	void setUPC(String gUPC)
	{
		UPC = gUPC;
	}
	
	void setReleaseDate(String greleaseDate)
	{
		releaseDate = greleaseDate;
	}
	
	void setESRB(String gESRB)
	{
		ESRB = gESRB;
	}
	
	void setCover(Image gcover)
	{
		cover = gcover;
	}
	
	void setNotes(String gnotes)
	{
		notes = gnotes;
	}
	
	void setPaid(BigDecimal gpaid)
	{
		paid = gpaid;
	}
	
	void setValue(BigDecimal gvalue)
	{
		value = gvalue;
	}
	
	void setRaiting(int graiting)
	{
		raiting = graiting;
	}
	
	void setCopies(int gcopies)
	{
		copies = gcopies;
	}
	
	void setCompleted(Boolean gcompleted)
	{
		completed = gcompleted;
	}
}
