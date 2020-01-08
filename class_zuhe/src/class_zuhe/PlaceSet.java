package class_zuhe;

//组合
public class PlaceSet extends Custom {
	Fork f;
	Spoon s;
	DinnerPlate d;  //这些都是类
	
	public PlaceSet(int i) {
		super(i+1);
		s = new Spoon(i+2);
		f = new Fork(i+2);
		d = new DinnerPlate(i+5);

	}
}
