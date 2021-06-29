package com.training.stereotypes;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(value = {TYPE,METHOD,FIELD})
public @interface Example {

	String title();
	String version() default "1.0";
}
