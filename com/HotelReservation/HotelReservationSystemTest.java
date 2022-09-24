package com.HotelReservation;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationSystemTest {

	// uc1
	@Test
	public void givenHotelNamesWhenAddedShouldReturnSize() {
		HotelReservationSystem obj = new HotelReservationSystem();
		obj.addHotel();
		Assertions.assertEquals(3, obj.hotelReservation.size());
	}

	// uc2
	@Test
	public void givenDateRangeShouldReturnTheCheapestHotelRate() {
		HotelReservationSystem obj = new HotelReservationSystem();
		obj.addHotel();
		Assertions.assertEquals(220, obj.findCheapestHotel("2020-09-10", "2020-09-11"));
	}

	// UC3
	@Test
	public void givenWeekDayWeekEndRatesShouldReturnThoseRates() {
		HotelReservationSystem obj = new HotelReservationSystem();
		obj.addHotel();
		Assertions.assertEquals(90, obj.hotelReservation.get("Lakewood").getWeekendRate());
		Assertions.assertEquals(50, obj.hotelReservation.get("Bridgewood").getWeekendRate());
		Assertions.assertEquals(150, obj.hotelReservation.get("Ridgewood").getWeekendRate());
	}

	// UC4
	@Test
	public void givenDateRangeShouldReturnTheCheapestHotelRateForWeekdayAndWeekend() {
		HotelReservationSystem obj = new HotelReservationSystem();
		obj.addHotel();
		Assertions.assertEquals(200, obj.findCheapestHotelForWeekdayAndWeekend("2020-09-11", "2020-09-12"));
	}

}
