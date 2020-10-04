package com.micro.usermeeting.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.micro.usermeeting.entity.Meeting;
import com.micro.usermeeting.exception.NotFoundException;
import com.micro.usermeeting.model.MeetingListDto;
import com.micro.usermeeting.repository.MeetingRepository;
import com.micro.usermeeting.service.MeetingService;

@Service
public class MeetingServiceImpl implements MeetingService{
	
	@Autowired
	private MeetingRepository meetingRepository;

	@Override
	public MeetingListDto getAllMeetingsByStudentId(Long studentId) {
		List<Meeting> meetingList = this.meetingRepository.getAllMeetingsByStudentId(studentId);
		MeetingListDto meetingListDto = new MeetingListDto(meetingList);
		return meetingListDto;
	}

	@Override
	public Meeting findMeetingById(long id) {
		Meeting meeting = this.meetingRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado"));
		return meeting;
	}

	@Override
	public Meeting saveMeeting(Meeting meeting) {
		return this.meetingRepository.save(meeting);
	}

	@Override
	public Meeting updateMeeting(Meeting meeting) {
		return this.meetingRepository.save(meeting);
	}

	@Override
	public void deleteStudentMeeting(Long idMeeting) {
		this.meetingRepository.deleteById(idMeeting);
	}

	@Override
	public void deleteAllStudentMeetings(Long idStudent) {
		this.meetingRepository.deleteAllMeetingsByStudentId(idStudent);
	}

}
