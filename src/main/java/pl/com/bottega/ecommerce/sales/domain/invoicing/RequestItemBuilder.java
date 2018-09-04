package pl.com.bottega.ecommerce.sales.domain.invoicing;

 import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductData;
 import pl.com.bottega.ecommerce.sharedkernel.Money;

 public class RequestItemBuilder {
 	private ProductData productData;

 	private int quantity;

 	private Money totalCost;
 	
 	public RequestItem build() {
 		return new RequestItem(productData, quantity, totalCost);
 	}
 	public RequestItemBuilder requestItem() {
 		return this;
 	}
 	public RequestItemBuilder withProductData(ProductData productData) {
 		this.productData=productData;
 		return this;
 	}
 	public RequestItemBuilder withQuantity(int quantity) {
 		this.quantity=quantity;
 		return this;
 	}
 	public RequestItemBuilder withTotalCost(Money totalCost) {
 		this.totalCost=totalCost;
 		return this;
 	}
 }