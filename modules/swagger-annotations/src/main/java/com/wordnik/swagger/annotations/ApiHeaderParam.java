package com.wordnik.swagger.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Describes a resource defined header parameter.
 * 
 * @author hendrik.stein
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiHeaderParam {
	/** Header parameter name. */
	String name();

	/** Description of this parameter. */
	String value();

}
