/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section20;

/**
 *
 * @author jigyasa_yadav
 */

enum Color {
	RED,
	GREEN,
	BLUE;

	private Color()
	{
		System.out.println("Constructor called for : "
						+ this.toString());
	}

	public void colorInfo()
	{
		System.out.println("Universal Color");
	}
}

public class EnumExample {
	
	public static void main(String[] args)
	{
		Color c1 = Color.RED;
		System.out.println(c1);
		c1.colorInfo();
	}
}
    

