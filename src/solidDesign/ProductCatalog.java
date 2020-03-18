package solidDesign;

import java.util.List;

public class ProductCatalog {

	
	public List<String> getAllProducts(){
		ProductRepo repo = ProductFactory.create();
		return repo.getAllProducts();
		
	}
}
