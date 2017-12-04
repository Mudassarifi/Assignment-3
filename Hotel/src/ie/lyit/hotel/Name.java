package ie.lyit.hotel;

public class Name {

	private String title, fName, sName;
	
	public Name()
	{
		title = fName = sName = null;
	}
	
	public Name(String t, String fN, String sN)
	{
		title = t;
		fName = fN;
		sName = sN;
	}
	
	@Override
	public String toString()
	{
		return title + " " + fName + " " + sName; 
	}
	
	public boolean equals(Object obj)
	{
		Name nObject;
		if (obj instanceof Name)
			nObject = (Name)obj;
		else
			return false;
		return this.title.equals(nObject.title)
				&& this.fName.equals(nObject.fName)
				&& this.sName.equals(nObject.sName);
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getFName()
	{
		return fName;
		
	}
	
	public String getSName()
	{
		return sName;
		
	}
	
	public void setTitle(String setTitleTo)
	{
		title = setTitleTo;
	}
	
	public void setFName(String setFNameTo)
	{
		fName = setFNameTo;
	}
	
	public void setSName(String setSNameTo)
	{
		sName = setSNameTo;
	}
		
	public boolean isFemale()
	{
		if(title.equalsIgnoreCase("Miss") ||
			title.equalsIgnoreCase("Ms") ||
			title.equalsIgnoreCase("Mrs"))
					return true;
					else 
						return false;
	}
}


