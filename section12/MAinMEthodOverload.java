/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section12;

/**
 *
 * @author jigyasa_yadav
 */
public class MAinMEthodOverload {

	public static void main(boolean args)
	{
		if (args) {
			System.out.println("main() overloaded"
							+ " method 1 Executing");
			System.out.println(args);

		MAinMEthodOverload.main("Hello", "World");
		}
	}

	
	public static void main(String a, String b)
	{
		System.out.println("main() overloaded"
						+ " method 2 Executing");
		System.out.println(a + " " + b);
	}


	public static void main(int args)
	{
		System.out.println("main() overloaded"
						+ " method 3 Executing");
		System.out.println(args);
	}

	public static void main(String[] args)
	{
		System.out.println("Original main()"
						+ " Executing");
		System.out.println("Hello");


		MAinMEthodOverload.main(true);

		
		MAinMEthodOverload.main(987654);
	}
}


