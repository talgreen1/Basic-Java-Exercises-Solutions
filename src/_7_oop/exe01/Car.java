package _7_oop.exe01;

/**
 * 
 * Define the class �Car�.
 * Add following members:
 *  - color
 *  - type
 * Add set & get methods for the color & type.
 * Create java program named CarFactory. It should create some cars and change their colors.
 *
 */
public class Car
{
	String m_color = null;
	String m_type = null;

	// Color set & get

	void setColor(String color)
	{
		m_color = color;
	}

	String getColor()
	{
		return m_color;
	}

	// Type set & get

	void setType(String type)
	{
		m_type = type;
	}

	String getType()
	{
		return m_type;
	}
}
