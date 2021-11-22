package junit7.util;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.describedAs;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import java.util.Calendar;

import org.junit.Test;

public class CoreMatcher {
	@Test
	public void isMatcherTest() {
		assertThat("fuck", is("fuck"));
		assertThat(true, is(true));
		assertThat(2021, is(2021));
	}

	@Test
	public void isNotMatcherTest() {
		assertThat(2021, is(not(2020)));
	}

	@Test
	public void equalToMatcherTest() {
		assertThat("mudada", is(equalTo("mudada")));
	}

	@Test
	public void isNullMatcherTest() {
		assertThat(null, is(nullValue()));
		assertThat("muda", is(not(nullValue())));
	}

	@Test
	public void allOfMatcherTest() {
		assertThat("mudada", allOf(startsWith("m"), containsString("mu"), endsWith("da")));
	}

	@Test
	public void anyOfMatcherTest() {
		Today today = new Today();
		int dayOfWeek = today.getToday();
		assertThat(dayOfWeek, anyOf(describedAs("Not have day of week in range",anyOf(is(Calendar.SUNDAY), 
                is(Calendar.MONDAY),
                is(Calendar.TUESDAY), 
                is(Calendar.WEDNESDAY),
                is(Calendar.THURSDAY), 
                is(Calendar.FRIDAY), 
                is(Calendar.SATURDAY)))));
	}
}
