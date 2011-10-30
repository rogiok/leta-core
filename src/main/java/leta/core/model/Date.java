package leta.core.model;

import java.util.Calendar;

public class Date {

    private String original;
    private String year;
    private String month;
    private String day;
    private String hour;
    private String minute;
    private String second;
    private String milisecond;
    private String amPm;
    private String timezone;
    
    public Date(String value) {
	this.original = value;
	
	this.validate();
    }

    public String getOriginal() {
        return original;
    }

//    public void setOriginal(String original) {
//        this.original = original;
//    }
    
    public boolean validate() {
	
	this.populate();
	
	return true;
    }
    
    private void populate() {
	String date = this.original.replace("[", "");
	
	// Tem data
	if (date.indexOf("-") > -1) {
	    int pos = date.indexOf("-");
	    
	    if (pos == 4) {
		year = date.substring(0, 4);
		date = date.substring(5);
	    }
	    
	    pos = date.indexOf(" ") > -1 ? date.indexOf(" ") : date.indexOf("]");
	    
	    if (pos > -1 && pos <= 2) {
		month = date.substring(0, pos);
		date = date.substring(pos + 1);
	    }
	    
	    pos = date.indexOf(" ") > -1 ? date.indexOf(" ") : date.indexOf("]");

	    if (pos > -1 && pos <= 2) {
		day = date.substring(0, pos);
		date = date.substring(pos + 1);
	    }
	}
	
	// Tem hora
	if (date.indexOf(":") > -1) {
	    
	}
    }
    
    public Date sum() {
	return calc(1);
    }
    
    public Date subtract() {
	return calc(-1);
    }

    public Date calc(int amount) {
	Calendar cal = Calendar.getInstance();
	
	String result = "[";
	
	if (year != null) {
	    cal.set(Calendar.YEAR, Integer.valueOf(year));
	    cal.add(Calendar.YEAR, amount);
	    result += cal.get(Calendar.YEAR);
	}

	if (month != null) {
	    cal.set(Calendar.MONTH, Integer.valueOf(month));
	    cal.add(Calendar.MONTH, amount);
	    result += year != null ? "-" + cal.get(Calendar.MONTH) : cal.get(Calendar.MONTH);
	}

	if (day != null) {
	    cal.set(Calendar.DAY_OF_MONTH, Integer.valueOf(day));
	    cal.add(Calendar.DAY_OF_MONTH, amount);
	    result += month != null ? "-" + cal.get(Calendar.DAY_OF_MONTH) : cal.get(Calendar.DAY_OF_MONTH);
	}
	
	return new Date(result + "]");
    }

    public String toString() {
	return this.original;
    }
}
