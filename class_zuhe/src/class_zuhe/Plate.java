package class_zuhe;

// 可以多个类 只是一个编译文件中只能哟一个public class

class Plate{  //盘子
	public Plate(int i) {
		System.out.println("Plate constructor");
	}
}
class DinnerPlate extends Plate{
	public DinnerPlate(int i) {
		super(i);   //调用父类中
		System.out.println("DinnerPlate constructor");
	}
}

class Utensil{   //用具 器皿
	public Utensil(int i) {
		System.out.println("Utensil constructor");
	}
}

class Fork extends Utensil{  //叉子
	public Fork(int i) {
		super(i);
		System.out.println("Fork constructor");
	}
} 

class Spoon extends Utensil{ //勺子
	public Spoon(int i) {
		super(i);
		System.out.println("spoon constructor");
	}
}






