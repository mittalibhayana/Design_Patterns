package solidDesign;

import java.util.Arrays;
import java.util.List;

public class SqlProductRepository implements ProductRepo {


	@Override
	public List<String> getAllProducts() {
		return Arrays.asList("water bottles","mats","lunch box");
	}
}
