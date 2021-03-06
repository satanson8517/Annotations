package com.avg.mne.annotation_processing.example;

import java.util.Optional;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.MirroredTypeException;

/**
 *
 * @author Michal Nedbálek <michal.nedbalek@avg.com> on 28/01/2016
 */
public class FactoryAnnotatedClass {

	private TypeElement annotatedClassElement;
	private String qualifiedSuperClassName;
	private String simpleTypeName;
	private String id;

	public FactoryAnnotatedClass(TypeElement classElement) throws IllegalArgumentException {
		this.annotatedClassElement = classElement;
		Factory annotation = classElement.getAnnotation(Factory.class);
		id = annotation.id();

		final Optional<String> o_id = Optional.ofNullable(id);
		if (!o_id.isPresent()) {
//		if (StringUtils.isEmpty(id)) {
			throw new IllegalArgumentException(
					String.format("id() in @%s for class %s is null or empty! that's not allowed",
							Factory.class.getSimpleName(), classElement.getQualifiedName().toString()));
		}

		// Get the full QualifiedTypeName
		try {
			Class<?> clazz = annotation.type();
			qualifiedSuperClassName = clazz.getCanonicalName();
			simpleTypeName = clazz.getSimpleName();
		} catch (MirroredTypeException mte) {
			DeclaredType classTypeMirror = (DeclaredType) mte.getTypeMirror();
			TypeElement classTypeElement = (TypeElement) classTypeMirror.asElement();
			qualifiedSuperClassName = classTypeElement.getQualifiedName().toString();
			simpleTypeName = classTypeElement.getSimpleName().toString();
		}
	}

	/**
	 * Get the id as specified in {@link Factory#id()}. return the id
	 *
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * Get the full qualified name of the type specified in
	 * {@link Factory#type()}.
	 *
	 * @return qualified name
	 */
	public String getQualifiedFactoryGroupName() {
		return qualifiedSuperClassName;
	}

	/**
	 * Get the simple name of the type specified in {@link Factory#type()}.
	 *
	 * @return qualified name
	 */
	public String getSimpleFactoryGroupName() {
		return simpleTypeName;
	}

	/**
	 * The original element that was annotated with @Factory
	 *
	 * @return
	 */
	public TypeElement getTypeElement() {
		return annotatedClassElement;
	}
}
