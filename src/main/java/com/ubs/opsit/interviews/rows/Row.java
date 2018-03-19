package com.ubs.opsit.interviews.rows;

import java.util.List;

public interface Row<T> {

	public String getRowDisplay();
	public List<T> getRowLamps();
	
}
