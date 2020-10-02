package builder_pattern.notsogoodexample;

public interface IBuilder 
{
	 void BuildBody();
	 void InsertWheels();
	 void AddHeadlights();
	 Product GetVehicle();
}
