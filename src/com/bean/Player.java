package com.bean;

public class Player {
	
		private int jno;
		private String pname,countryName;
		public int getJno() {
			return jno;
		}
		public void setJno(int jno) {
			this.jno = jno;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		@Override
		public String toString() {
			return  jno + "\t" + pname + "\t" + countryName ;
		}
		
		
		
}
