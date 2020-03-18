package solidDesign;

public class ProductFactory {

	public static ProductRepo create() {
		return new SqlProductRepository();
	}
}
