package design;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterviewPrepTW {


	public static void main(String[] args) {
		int attendees = 5;
		int rooms = 2;
		int interviewer = 3;
		int startTime = 9;
		int endTime = 6;
		List<String> timeSlots = new InterviewPrepTW().getSlotsAvailable(startTime, endTime);
		List<String> listOfRooms = new ArrayList<String>();
		List<String> listOfInterviews = new ArrayList<>();
		for (int i = 1; i <= rooms; i++) {
			listOfRooms.add("Room " + i);
		}
		
		for(int i=1;i<interviewer;i++) {
			listOfInterviews.add("Interviewer "+i);
		}

		
		
		
		
	}

	private List<String> getSlotsAvailable(int startTime, int endTime) {
		endTime = endTime + 12;
		List<String> timeSlotsList = new ArrayList<>();
		while(startTime < endTime && (startTime+2 < endTime)) {
		String range = (startTime< 12 ? startTime: startTime - 12) + "-" + (startTime + 2  < 12 ? (startTime + 2) : (startTime+2) - 12);
		timeSlotsList.add(range);
		startTime = startTime + 2;
		}
		return timeSlotsList;
	}

}
