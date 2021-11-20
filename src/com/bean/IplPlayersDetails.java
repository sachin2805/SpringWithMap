package com.bean;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IplPlayersDetails {
	 	
		private Map<String,Player>P;

		public Map<String, Player> getP() {
			return P;
		}

		public void setP(Map<String, Player> p) {
			P = p;
		}
		
		public void display()
		{
			Map<String,Player>m=getP();
			
			for(Entry<String,Player>data:m.entrySet())
			{
				System.out.println(data.getValue()+"\t"+data.getKey());
			}
		}

}
