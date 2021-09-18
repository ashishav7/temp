package com.comviva.selflearning.comparable;

public class Bus implements Comparable<Bus>{

		
		private Integer busId;
		private String busName;
		private Double fare;
		private Double ratings;
		
		public Bus() {
			super();
			}
			public Bus(Integer busId, String busName, Double fare, Double ratings) {
			super();
			this.busId = busId;
			this.busName = busName;
			this.fare = fare;
			this.ratings = ratings;
		}
			@Override
		public String toString() {
			return "Bus [busId=" + busId + ", busName=" + busName + ", fare=" + fare + ", ratings=" + ratings + "]";
		}
		
		
		public Integer getBusId() {
			return busId;
		}
		public void setBusId(int busId) {
			this.busId = busId;
		}
		public String getBusName() {
			return busName;
		}
		public void setBusName(String busName) {
			this.busName = busName;
		}
		public Double getFare() {
			return fare;
		}
		public void setFare(double fare) {
			this.fare = fare;
		}
		public Double getRatings() {
			return ratings;
		}
		public void setRatings(double ratings) {
			this.ratings = ratings;
		}
		
		
		@Override
		public int compareTo(Bus o) {
			// TODO Auto-generated method stub
			return o.busId.compareTo(this.busId);
		}
		
}
