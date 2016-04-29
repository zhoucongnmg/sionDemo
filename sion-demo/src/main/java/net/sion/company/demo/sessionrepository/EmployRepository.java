package net.sion.company.demo.sessionrepository;

import java.util.List;

import net.sion.company.demo.domain.EmployInfo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployRepository extends MongoRepository<EmployInfo, String>{

	public List<EmployInfo> findAllByName(String name);
}
