package com.phoenix.spring;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class StudentFieldSetMapper implements FieldSetMapper<Student> {

	@Override
	public Student mapFieldSet(FieldSet fieldSet) throws BindException {
		Student ref=new Student(fieldSet.readInt("stid"),fieldSet.readString("stname"),fieldSet.readInt("marks"));
		System.out.println(ref.getStid());
		return ref;

	}

}
