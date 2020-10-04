package com.micro.usermeeting.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.micro.usermeeting.entity.Meeting;

@Repository
@Transactional
public interface MeetingRepository extends JpaRepository<Meeting, Long> {

	@Query("SELECT m FROM Meeting m where m.idStudent = ?1")
	List<Meeting> getAllMeetingsByStudentId(Long studentId);
	
	@Query("DELETE FROM Meeting m where m.idStudent = ?1")
	void deleteAllMeetingsByStudentId(Long studentId);
}
