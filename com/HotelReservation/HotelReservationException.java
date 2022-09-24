package com.HotelReservation;

public class HotelReservationException extends RuntimeException {
	public enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY;
	}

	ExceptionType type;

	public HotelReservationException(ExceptionType type, String message) {

		super(message);
		this.type = type;

	}
}