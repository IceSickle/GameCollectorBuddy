package gameCollectorBuddy;

import java.io.Serializable;
import java.math.BigDecimal;
import javafx.scene.image.Image;

public class Hardware implements Serializable, Comparable<Hardware>
{
	private Integer id = null;
	private String title = null;
	private String gameSystem = null;
	private String URL = null;
	private String condition = null;
	private String UPC = null;
	private String releaseDate = null;
	private String ESRB = null;
	private Image cover = null;
	private String notes = null;
	private BigDecimal paid = null;
	private BigDecimal value = null;
	private int raiting = 0;
	private int copies = 0;
	private Boolean completed = null;
	
	//CONSTRUCTOR
	public Hardware(Integer gid, String gtitle, String ggameSystem, String gURL, String gcondition, String gUPC, String greleaseDate, String gESRB, Image gcover, String gnotes, BigDecimal gpaid, BigDecimal gvalue, int graiting, int gcopies, Boolean gcompleted)
	{
		id = gid;
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
	
	public void writeGame()
	{
		
	}
	
	public boolean equals(Hardware h)
	{
		if(h.getTitle() == this.getTitle() && h.getGameSystem() == this.getGameSystem())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int compareTo(Hardware h)
	{
		return getTitle().compareToIgnoreCase(h.getTitle());
	}
	///////////////////
	//      GETS     //
	///////////////////
	public Integer getID()
	{
		return id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getGameSystem()
	{
		return gameSystem;
	}
	
	public String getURL()
	{
		return URL;
	}
	
	public String getCondition()
	{
		return condition;
	}
	
	public String getUPC()
	{
		return UPC;
	}
	
	public String getReleaseDate()
	{
		return releaseDate;
	}
	
	public String getESRB()
	{
		return ESRB;
	}
	
	public Image getCover()
	{
		return cover;
	}
	
	public String getNotes()
	{
		return notes;
	}
	
	public BigDecimal getPaid()
	{
		return paid;
	}
	
	public BigDecimal getValue()
	{
		return value;
	}
	
	public int getRaiting()
	{
		return raiting;
	}
	
	public int getCopies()
	{
		return copies;
	}
	
	public Boolean getCompleted()
	{
		return completed;
	}
	
	///////////////////
	//      SETS     //
	///////////////////
	public void setID(Integer gid)
	{
		id = gid;
	}
	
	public void setTitle(String gtitle)
	{
		title = gtitle;
	}
	
	public void setGameSystem(String ggameSystem)
	{
		gameSystem = ggameSystem;
	}
	
	public void setURL(String gURL)
	{
		URL = gURL;
	}
	
	public void setCondition(String gcondition)
	{
		condition = gcondition;
	}
	
	public void setUPC(String gUPC)
	{
		UPC = gUPC;
	}
	
	public void setReleaseDate(String greleaseDate)
	{
		releaseDate = greleaseDate;
	}
	
	public void setESRB(String gESRB)
	{
		ESRB = gESRB;
	}
	
	public void setCover(Image gcover)
	{
		cover = gcover;
	}
	
	public void setNotes(String gnotes)
	{
		notes = gnotes;
	}
	
	public void setPaid(BigDecimal gpaid)
	{
		paid = gpaid;
	}
	
	public void setValue(BigDecimal gvalue)
	{
		value = gvalue;
	}
	
	public void setRaiting(int graiting)
	{
		raiting = graiting;
	}
	
	public void setCopies(int gcopies)
	{
		copies = gcopies;
	}
	
	public void setCompleted(Boolean gcompleted)
	{
		completed = gcompleted;
	}
}
