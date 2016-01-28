package com.avg.mne.annotation_processing;

import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

/**
 * Every annotation processor runs its own JVM!!! So e.g. Guava can be used. :)
 * https://github.com/sockeqwe/annotationprocessing101
 * 
 * @author Michal Nedbálek <michal.nedbalek@avg.com> on 28/01/2016
 */
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@SupportedAnnotationTypes({ // Set of full qullified annotation type names
})
public class PlainJavaProcessor extends AbstractProcessor {

	// Every annotation processor class must have an empty constructor - method init.
	@Override
	public synchronized void init(ProcessingEnvironment env) {
	}

	// This is kind of main() method of each processor.
	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	// NEXT METHODS ARE NOT NECESSARY WITH JAVA 7+ - USE ANNOTATIONS INSTEAD:
	// (For Android (and compatibility reasons) it is still better to use the methods)
	/* @SupportedSourceVersion(SourceVersion.latestSupported())
	 * @SupportedAnnotationTypes({
	 * // Set of full qullified annotation type names
	 * })
	 */
	//<editor-fold>
	/*
	
	 // Here is specified which annotation is the annotation processor specified for.
	 // Not necessary with Java 7+
	 @Override
	 public Set<String> getSupportedAnnotationTypes() {
	 return new HashSet<>();
	 }

	 // Here is specified which Java version to use.
	 @Override
	 public SourceVersion getSupportedSourceVersion() {
	 return SourceVersion.latest();
	 }*/
	//</editor-fold>
}
