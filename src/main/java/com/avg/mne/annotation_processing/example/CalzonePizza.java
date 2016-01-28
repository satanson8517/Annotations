package com.avg.mne.annotation_processing.example;

/**
 *
 * @author Michal Nedbálek <michal.nedbalek@avg.com> on 28/01/2016
 */
@Factory(
		id = "Calzone",
		type = Meal.class
)
public class CalzonePizza implements Meal {

	@Override
	public float getPrice() {
		return 8.5f;
	}
}
