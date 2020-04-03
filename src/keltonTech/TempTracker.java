package keltonTech;

import java.util.HashMap;
import java.util.Map;

public class TempTracker {

	double min = 0;
	double max = 0;

	int count = 0;
	double sum = 0;
	int countFreq = 0;
	double key = 0;

	Map<Double, Integer> map = new HashMap<>();

	public void insert(double temp) {

		if (map.isEmpty()) {
			min = temp;
			max = temp;
			countFreq = 1;
			key = temp;
		}

		sum += temp;
		count++;
		if (temp < min) {
			min = temp;
		}
		if (temp > max) {
			max = temp;
		}
		if (map.containsKey(temp)) {
			int val = map.get(temp);
			val++;
			map.put(temp, val);
			val = map.get(temp);
			if (val > countFreq) {
				countFreq = val;
				key = temp;
			}
		} else {
			map.put(temp, 1);
		}
	}

	public double getMin() {
		return min;
	}

	public double getMax() {
		return max;
	}

	public float getMean() {
		return (float) sum / count;
	}

	public double getMode() {
		return key;
	}

	public static void main(String[] args) {

		TempTracker temp = new TempTracker();
		temp.insert(99.99);
		temp.insert(97.8);
		temp.insert(102);
		temp.insert(104);
		temp.insert(98);
		temp.insert(99);

		System.out.println(temp.getMin());
		System.out.println(temp.getMax());
		System.out.println(temp.getMean());
		System.out.println(temp.getMode());
	}
}
