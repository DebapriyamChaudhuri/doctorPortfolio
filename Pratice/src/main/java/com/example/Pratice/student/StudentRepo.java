package com.example.Pratice.student;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository <Student,Long>
{
	@Transactional
	@Query (value="select distinct ftime from student where ftime=:t",nativeQuery=true)
	String findByFtime(@Param("t") String ftime);
	
	@Transactional
	@Query (value="select distinct date from student where date=:n",nativeQuery=true)
	String getByDate(@Param("n") String date);
	

}

