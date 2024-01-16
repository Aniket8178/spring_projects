package productapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productapp.modle.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	@Transactional
	public void createproduct(Product product)
	{
		this.hibernatetemplate.save(product);
	}
	
	//get all product
	public List<Product> getproduct(){
		List<Product> products = this.hibernatetemplate.loadAll(Product.class);
		return products;
	}
	
	//delete the single product
	@Transactional
	public void deleteproduct(int pid)
	{
		Product p = this.hibernatetemplate.load(Product.class, pid);
		this.hibernatetemplate.delete(p);
	}
	
	//get single product
	public Product getproduct(int pid)
	{
		return this.hibernatetemplate.get(Product.class, pid);
	}
}
