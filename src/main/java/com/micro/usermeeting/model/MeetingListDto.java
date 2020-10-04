package com.micro.usermeeting.model;

import java.util.List;

import com.micro.usermeeting.entity.Meeting;

public class MeetingListDto {

	List<Meeting> meetingList;

	
	public MeetingListDto() {

	}

	public MeetingListDto(List<Meeting> meetingList) {
		super();
		this.meetingList = meetingList;
	}

	public List<Meeting> getMeetingList() {
		return meetingList;
	}

	public void setMeetingList(List<Meeting> meetingList) {
		this.meetingList = meetingList;
	}
	
}
