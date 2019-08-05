using System;

namespace napkin
{
	class Program
	{
		static void Main(string[] args)
		{
			double height = 0.0;
			double volume = 0.0;

			while(true)
			{
				Console.WriteLine("Enter the height of the napkin ring");
				string temp = Console.ReadLine();

				if (double.TryParse(temp, out height))
				{
					volume = calcVolume(height);

					Console.WriteLine(volume);
				}
			}
		}

		public static double calcVolume(double height)
		{
			double retVal = Math.Pow(height, 3) * Math.PI * (1.0 / 6.0);

			return retVal;
		}
	}
}