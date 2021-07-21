package demo.crop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.crop.model.AddProduct;

public interface AddProductRepository extends JpaRepository<AddProduct, Long> {

	Optional<AddProduct> findByName(String name);
}
