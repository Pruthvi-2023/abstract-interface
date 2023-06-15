package abstraction;

public class Calculation {
// three functions used same name so its called overloading
	int Sum(int p1, int p2) {
		return p1 + p2;
	}

	int Sum(int p1, int p2, int p3) {

		return p1 + p2 + p3;
	}

	float Sum(float p1, float p2) {
		return p1 + p2;

	}

}
