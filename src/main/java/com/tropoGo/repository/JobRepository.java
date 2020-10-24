package com.tropoGo.repository;


import org.springframework.data.repository.CrudRepository;

import com.tropoGo.entity.Job;

public interface JobRepository extends CrudRepository<Job, Integer>  {

}
