package com.jaehyun.namecard.repository;

import org.springframework.data.repository.CrudRepository;

import com.jaehyun.namecard.vo.Department;

interface DepartmentRepository extends CrudRepository<Department, Long>{

}
