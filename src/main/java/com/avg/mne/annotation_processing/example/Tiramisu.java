package com.avg.mne.annotation_processing.example;

/**
 *
 * @author Michal Nedbálek <michal.nedbalek@avg.com> on 28/01/2016
 */
@Factory(
		id = "Tiramisu",
		type = Meal.class
)
public class Tiramisu implements Meal {

	@Override
	public float getPrice() {
		return 4.5f;
	}
}
