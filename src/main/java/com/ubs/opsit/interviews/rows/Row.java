package com.ubs.opsit.interviews.rows;

import java.util.List;

public interface Row<T> {

	public String getRowDisplay();
	List<T> getRowLamps();
	
}
