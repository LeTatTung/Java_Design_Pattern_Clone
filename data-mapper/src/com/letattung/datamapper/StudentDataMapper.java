/*
 * hoc theo design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/data-mapper
 */
package com.letattung.datamapper;

import java.util.Optional;

public interface StudentDataMapper {

	Optional<Student> find(int studentId);
	void insert(Student student) throws DataMapperException;
	void update(Student student) throws DataMapperException;
	void delete(Student student) throws DataMapperException;
}
