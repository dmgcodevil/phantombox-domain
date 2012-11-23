package com.git.domain.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Cascade save for mongodb.
 * <p/>
 * Date: 19.11.12
 * Time: 17:39
 *
 * @author rpleshkov
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface CascadeSave {

}

