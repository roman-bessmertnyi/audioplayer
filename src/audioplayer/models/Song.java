package audioplayer.models;

public class Song {
	private int songid;
	public void setSongId(int songid)
	{
		this.songid = songid;
	}
	public int getSongId()
	{
		return songid;
	}
	
    private String name;
    public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	@Override
    public String toString() {
        return "Song [songid=" + songid + ", name=" + name + "]";
    } 
}
