package com.micro.usermeeting.service;

import com.micro.usermeeting.entity.Meeting;
import com.micro.usermeeting.model.MeetingListDto;


public interface MeetingService {

	MeetingListDto getAllMeetingsByStudentId(Long studentId);
	Meeting findMeetingById(long id);
	Meeting saveMeeting(Meeting meeting);
	Meeting updateMeeting(Meeting meeting);
	void deleteStudentMeeting(Long idMeeting);
	void deleteAllStudentMeetings(Long idStudent);
}
