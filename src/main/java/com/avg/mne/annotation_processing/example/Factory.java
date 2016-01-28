package com.avg.mne.annotation_processing.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Michal Nedbálek <michal.nedbalek@avg.com>
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
//@Inherited
public @interface Factory {

	/**
	 * The name of the factory
	 * @return 
	 */
	Class type();

	/**
	 * The identifier for determining which item should be instantiated
	 * @return 
	 */
	String id();
}
