package junit7.util;

import java.util.Calendar;
import java.util.Locale;

public class Today {
	public int getToday() {
		return Calendar.getInstance(Locale.US).get(Calendar.DAY_OF_WEEK);
	}
}
